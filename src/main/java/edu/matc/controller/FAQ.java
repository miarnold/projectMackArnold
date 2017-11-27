package edu.matc.controller;

import edu.matc.persistence.CarsHibDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet (
        urlPatterns = {"/FAQ"}
)

public class FAQ extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        CarsHibDao carsHib = new CarsHibDao();
        req.setAttribute("cars", carsHib.getAllCars());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/JSP/faq.jsp");
        dispatcher.forward(req, resp);

    }


}