package org.lab.scooters.servlets.user;

import org.lab.scooters.implementaions.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SaveUserServlet", value = "/saveUser")
public class SaveUserServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse  response) throws ServletException, IOException {
        UserService userService = new UserService();
        userService.saveUser(userService.parseUser(request));

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
