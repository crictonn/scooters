package org.lab.scooters.servlets.company;

import org.lab.scooters.implementaions.CompanyService;
import org.lab.scooters.implementaions.ScooterService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DeleteScooter", value = "/deleteScooter")
public class DeleteCompanyServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        CompanyService companyService = new CompanyService();
        companyService.deleteCompany(companyService.getCompanyByID(Long.valueOf(request.getParameter("id"))));
    }
}
