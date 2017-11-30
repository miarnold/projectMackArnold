package edu.matc.controller;

import edu.matc.entity.Routes;
import edu.matc.persistence.CarsHibDao;
import edu.matc.persistence.RouteDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * The type My reports.
 */
@WebServlet (
        urlPatterns = {"/MyReports"}
)

public class MyReports extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {





        RouteDao dao = new RouteDao();
        CarsHibDao carsHib = new CarsHibDao();
        req.setAttribute("cars", carsHib.getAllCars());
        String userNameOfCurrentUser = req.getRemoteUser();
        Routes addRoute = new Routes();
        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        addRoute.setDriverName(req.getParameter("name"));
        addRoute.setCommuteNotes(req.getParameter("notes"));
        addRoute.setDateOfTrip(req.getParameter("date"));
        String gas = req.getParameter("gas");
        if(gas != null) {double gasDouble = Double.parseDouble(gas);
        addRoute.setGasPrice(gasDouble);}
        String cityMiles = req.getParameter("city");
        if(cityMiles != null) { int cityInt = Integer.parseInt(cityMiles);
            addRoute.setNumberOfCityMiles(cityInt); }
        String highMiles = req.getParameter("highway");
        if(highMiles != null) { int highInt = Integer.parseInt(highMiles);
            addRoute.setNumberOfHighwayMiles(highInt); }
        addRoute.setWhichCar(req.getParameter("car"));

        int totalNumberOfMiles = (addRoute.getNumberOfCityMiles() + addRoute.getNumberOfHighwayMiles());
        addRoute.setNumberOfMiles(totalNumberOfMiles);
        addRoute.setMpgCity(req.getParameter("cmpg"));
        addRoute.setMpgHigh(req.getParameter("hmpg"));


        //double cityMPG = Double.parseDouble(addRoute.getMpgCity());
        //double highMPG = Double.parseDouble(addRoute.getMpgHigh());
        if (addRoute.getMpgCity() != null && addRoute.getMpgHigh() != null) {
            log.info("city miles:" + addRoute.getNumberOfCityMiles());
            log.info("city mpg: " + Double.parseDouble(addRoute.getMpgCity()));
            log.info("highwayMiles: " + addRoute.getNumberOfHighwayMiles());
            log.info("highway mpg: " + Double.parseDouble(addRoute.getMpgHigh()));
            log.info("gas price: "  + addRoute.getGasPrice());
            double totalMoney = (((addRoute.getNumberOfCityMiles() / Double.parseDouble(addRoute.getMpgCity())) * addRoute.getGasPrice()) + ((addRoute.getNumberOfHighwayMiles() / Double.parseDouble(addRoute.getMpgHigh())) * addRoute.getGasPrice()));
            log.info(totalMoney);
            decimalFormat.format(totalMoney);
            log.info(totalMoney);
            String totalMoneyString = String.valueOf(totalMoney);
            addRoute.setTotal(totalMoneyString);
        }


        addRoute.setUserName(userNameOfCurrentUser);

        dao.addRoute(addRoute);




        RequestDispatcher dispatcher = req.getRequestDispatcher("/JSP/reports.jsp");
        dispatcher.forward(req, resp);

    }


}