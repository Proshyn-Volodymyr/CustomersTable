package com.example.customerstable;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CustomerViewServlet extends HttpServlet {

    Customer customer1 = new Customer.Builder("Eddard", "Stark").gender(Gender.MALE).educationDegree(EducationDegree.MASTER).
            martialStatus(MaritalStatus.MARRIED).email("es.gmail.com").address("Winterfell").phoneNumber("+3808555655").postNumber(18000).id(1).
            amountOfChildren(3).idCardNumber(10001000).healthInsuranceNumber(100100)
            .dateOfRegistration("2022-03-12").build();
    Customer customer2 = new Customer.Builder("Jaime", "Lannister").gender(Gender.MALE).educationDegree(EducationDegree.BACHELOR).
            martialStatus(MaritalStatus.SINGLE).email("es.gmail.com").address("Casterly Rock").phoneNumber("+3808755677").postNumber(18222).id(2).
            amountOfChildren(3).idCardNumber(1777717777).healthInsuranceNumber(177177)
            .dateOfRegistration("2022-03-12").build();
    Customer customer3 = new Customer.Builder("Cercei", "Lannister").gender(Gender.FEMALE).educationDegree(EducationDegree.MASTER).
            martialStatus(MaritalStatus.MARRIED).email("cl.gmail.com").address("Casterly Rock").phoneNumber("+3808555622").postNumber(18222).id(3).
            amountOfChildren(3).idCardNumber(12221222).healthInsuranceNumber(122122)
            .dateOfRegistration("2022-03-12").build();
    List<Customer> customers = Arrays.asList(customer1, customer2, customer2);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setAttribute("customerList", customers);
        request.setAttribute("customers", getCustomerTable());
        request.getRequestDispatcher("/customers.jsp").forward(request, response);
    }

    public String getCustomerTable() {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers
        ) {
            sb.append("<tr>").append("<td>" + customer.getName() + "<td>")
                    .append("<td>" + customer.getLastName() + "<td>")
                    .append("<td>" + customer.getGender() + "<td>")
                    .append("<tr>");
        }
        return sb.toString();
    }


}
