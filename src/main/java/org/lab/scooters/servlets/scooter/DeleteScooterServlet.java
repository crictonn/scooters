package org.lab.scooters.servlets.scooter;

import org.lab.scooters.implementaions.ScooterService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DeleteScooter", value = "/deleteScooter")
public class DeleteScooterServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        ScooterService scooterService = new ScooterService();
        scooterService.deleteScooter(scooterService.getScooterByID(Long.valueOf(request.getParameter("id"))));
    }
}
