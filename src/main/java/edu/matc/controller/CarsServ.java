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
        int YearNumeric = Integer.parseInt(year);
        addCar.setYearOfMake(YearNumeric);
        addCar.setVehicleType(req.getParameter("type"));
        addCar.setCityMiles(Integer.parseInt(req.getParameter("city")));
        String highwayMiles = (req.getParameter("highway"));
        int highwayMilesNumeric = Integer.parseInt(highwayMiles);
        addCar.setHighwayMiles(highwayMilesNumeric);
        addCar.setVin(Integer.parseInt(req.getParameter("vin")));
        addCar.setFuelType(req.getParameter("gas"));

        carsHib.addCar(addCar);









        RequestDispatcher dispatcher = req.getRequestDispatcher("/JSP/cars.jsp");
        dispatcher.forward(req, resp);

    }


}