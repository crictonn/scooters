package org.lab.scooters.servlets.company;

import org.lab.scooters.implementaions.CompanyService;
import org.lab.scooters.implementaions.ScooterService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GetAllCompanies", value = "/getAllCompanies")
public class GetAllCompanies extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        CompanyService companyService = new CompanyService();
        request.setAttribute("companies", companyService.getAllCompanies());
//        request.getRequestDispatcher().forward(request, response);
    }
}
