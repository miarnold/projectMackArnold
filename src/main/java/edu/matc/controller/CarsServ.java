package edu.matc.controller;

import edu.matc.entity.Cars;
import edu.matc.entity.User;
import edu.matc.persistence.CarsHibDao;
import edu.matc.persistence.UserHibernateDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet (
        urlPatterns = {"/CarsServ"}
)

public class CarsServ extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cars addCar = new Cars();
        User user = new User();
        UserHibernateDao userDao = new UserHibernateDao();
        CarsHibDao carsHib = new CarsHibDao();
        req.setAttribute("cars", carsHib.getAllCars());
        String userNameOfCurrentUser = req.getRemoteUser();
        //List<User> userList = new ArrayList<User>();
        //userList.add(userNameOfCurrentUser);
        //userList = userDao.selectuserByName(userNameOfCurrentUser);
        //log.info(userList);

        addCar.setCarName(req.getParameter("carName"));
        String year = (req.getParameter("yearOfCar"));
        if(year != null) {int YearNumeric = Integer.parseInt(year);
        addCar.setYearOfMake(YearNumeric);}
        addCar.setVehicleType(req.getParameter("type"));
        String city = req.getParameter("city");
        if (city != null) {int cityNumeric = Integer.parseInt(city);
        addCar.setCityMiles(cityNumeric);}
        String highwayMiles = (req.getParameter("highway"));
        if (highwayMiles != null) {int highwayMilesNumeric = Integer.parseInt(highwayMiles);
        addCar.setHighwayMiles(highwayMilesNumeric);}
        String vinString = req.getParameter("vin");
        if(vinString != null) {int vinNumeric = Integer.parseInt(vinString);
            addCar.setVin(vinNumeric);}
        addCar.setUsername(userNameOfCurrentUser);
        addCar.setFuelType(req.getParameter("gas"));

        carsHib.addCar(addCar);









        RequestDispatcher dispatcher = req.getRequestDispatcher("/JSP/cars.jsp");
        dispatcher.forward(req, resp);

    }


}