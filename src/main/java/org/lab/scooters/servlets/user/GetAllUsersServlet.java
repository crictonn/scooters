package org.lab.scooters.servlets.user;

import org.lab.scooters.implementaions.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GetAllUsersServlet", value = "/getAllUsers")
public class GetAllUsersServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService = new UserService();
        request.setAttribute("users", userService.getAllUsers());
        request.getRequestDispatcher("allUsers.jsp").forward(request, response);
    }

}
