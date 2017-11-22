package edu.matc.controller;

import edu.matc.entity.Routes;
import edu.matc.persistence.CarsHibDao;

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







        RequestDispatcher dispatcher = req.getRequestDispatcher("/JSP/reports.jsp");
        dispatcher.forward(req, resp);

    }


}