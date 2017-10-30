package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.entity.UserRole;
import edu.matc.persistence.UserHibernateDao;
import edu.matc.persistence.userRoleHibDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet (
        urlPatterns = {"/Sign-Up"}
)

public class SignUp extends HttpServlet {

    private final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserHibernateDao userDao = new UserHibernateDao();
        userRoleHibDao roleDao = new userRoleHibDao();
        User addMe = new User();

        addMe.setFirstName(req.getParameter("firstName"));
        addMe.setLastName(req.getParameter("lastName"));
        addMe.setUserName(req.getParameter("userName"));
        addMe.setUserPass(req.getParameter("password"));
        addMe.setEmail(req.getParameter("email"));


        userDao.addUser(addMe);
        UserRole role = new UserRole(addMe.getUserId(), addMe.getFirstName(),"registered-user");
        log.error(role);
        roleDao.addRole(role);






        RequestDispatcher dispatcher = req.getRequestDispatcher("/JSP/SignUp.jsp");
        dispatcher.forward(req, resp);

    }


}