package edu.matc.controller;

import edu.matc.entity.Cars;
import edu.matc.entity.Routes;
import edu.matc.entity.User;
import edu.matc.persistence.CarsHibDao;
import edu.matc.persistence.RouteDao;
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
        urlPatterns = {"/DeleteRouteServ"}
)

public class DeleteRouteServ extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        RouteDao dao = new RouteDao();
        Routes route = new Routes();

        int id = Integer.parseInt(req.getParameter("checkbox"));

        dao.deleteRoute(id);

        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req, resp);
    }


}
