package edu.matc.controller;

import edu.matc.entity.Cars;
import edu.matc.persistence.CarsHibDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet (
        urlPatterns = {"/CarsServ"}
)

public class CarsServ extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cars addCar = new Cars();
        CarsHibDao carsHib = new CarsHibDao();
        req.setAttribute("cars", carsHib.getAllCars());

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
        addCar.setFuelType(req.getParameter("gas"));

        carsHib.addCar(addCar);









        RequestDispatcher dispatcher = req.getRequestDispatcher("/JSP/cars.jsp");
        dispatcher.forward(req, resp);

    }


}