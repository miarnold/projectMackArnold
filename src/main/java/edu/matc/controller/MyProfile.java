package edu.matc.controller;

import edu.matc.persistence.CarsHibDao;
import edu.matc.persistence.RouteDao;
import edu.matc.persistence.UserHibernateDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * The type My profile.
 */
@WebServlet (
        urlPatterns = {"/MyProfile"}
)

public class MyProfile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String userNameOfCurrentUser = req.getRemoteUser();

        CarsHibDao carsHib = new CarsHibDao();
        req.setAttribute("cars", carsHib.getAllCars());

        RouteDao daoRoute = new RouteDao();
        req.setAttribute("routes", daoRoute.getAllRoutes());

        req.setAttribute("name",userNameOfCurrentUser);


        RequestDispatcher dispatcher = req.getRequestDispatcher("JSP/profile.jsp");
        dispatcher.forward(req, resp);

    }


}