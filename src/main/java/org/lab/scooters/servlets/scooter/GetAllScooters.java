package org.lab.scooters.servlets.scooter;

import org.lab.scooters.implementaions.ScooterService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GetAllScooters", value = "/getAllScooters")
public class GetAllScooters extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        ScooterService scooterService = new ScooterService();
        request.setAttribute("scooters", scooterService.getAllScooters());
//        request.getRequestDispatcher().forward(request, response);
    }
}
