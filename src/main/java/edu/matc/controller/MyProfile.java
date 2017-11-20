package edu.matc.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet (
        urlPatterns = {"/MyProfile"}
)

public class MyProfile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String userNameOfCurrentUser = req.getRemoteUser();


        RequestDispatcher dispatcher = req.getRequestDispatcher("JSP/profile.jsp");
        dispatcher.forward(req, resp);

    }


}