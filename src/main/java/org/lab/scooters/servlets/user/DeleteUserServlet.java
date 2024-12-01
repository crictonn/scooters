package org.lab.scooters.servlets.user;

import org.lab.scooters.implementaions.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteUserServlet", value = "/deleteUser")
public class DeleteUserServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService = new UserService();
        userService.deleteUser(userService.getUserByID(Long.valueOf(request.getParameter("id"))));
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
