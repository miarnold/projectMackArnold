package edu.matc.controller;

import edu.matc.entity.Routes;
import edu.matc.persistence.CarsHibDao;
import edu.matc.persistence.RouteDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet (
        urlPatterns = {"/MyReports"}
)

public class MyReports extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


         int cityInt;
         int highInt;


        RouteDao dao = new RouteDao();
        CarsHibDao carsHib = new CarsHibDao();
        req.setAttribute("cars", carsHib.getAllCars());
        String userNameOfCurrentUser = req.getRemoteUser();
        Routes addRoute = new Routes();

        addRoute.setDriverName(req.getParameter("name"));
        addRoute.setCommuteNotes(req.getParameter("notes"));
        addRoute.setDateOfTrip(req.getParameter("date"));
        String gas = req.getParameter("gas");
        if(gas != null) {Double gasDouble = Double.parseDouble(gas);
        addRoute.setGasPrice(gasDouble);}
        String cityMiles = req.getParameter("city");
        if(cityMiles != null) { cityInt = Integer.parseInt(cityMiles);
            addRoute.setNumberOfCityMiles(cityInt); }
        String highMiles = req.getParameter("highway");
        if(highMiles != null) { highInt = Integer.parseInt(highMiles);
            addRoute.setNumberOfHighwayMiles(highInt); }
        addRoute.setWhichCar(req.getParameter("car"));

        int totalNumberOfMiles = (addRoute.getNumberOfCityMiles() + addRoute.getNumberOfHighwayMiles());
        addRoute.setNumberOfMiles(totalNumberOfMiles);

        addRoute.setUserName(userNameOfCurrentUser);

        dao.addRoute(addRoute);




        RequestDispatcher dispatcher = req.getRequestDispatcher("/JSP/reports.jsp");
        dispatcher.forward(req, resp);

    }


}