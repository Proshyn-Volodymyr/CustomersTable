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
            martialStatus(MaritalStatus.MARRIED).email("es.gmail.com").address("Winterfell").phoneNumber("+3808555655").postNumber(18000).id(1).age(55).
            amountOfChildren(3).idCardNumber(10001000).healthInsuranceNumber(100100)
            .dateOfRegistration("2022-03-12").build();
    Customer customer2 = new Customer.Builder("Jaime", "Lannister").gender(Gender.MALE).educationDegree(EducationDegree.BACHELOR).
            martialStatus(MaritalStatus.SINGLE).email("es.gmail.com").address("Casterly Rock").phoneNumber("+3808755677").postNumber(18222).id(2).age(37).
            amountOfChildren(3).idCardNumber(1777717777).healthInsuranceNumber(177177)
            .dateOfRegistration("2022-03-12").build();
    Customer customer3 = new Customer.Builder("Cercei", "Lannister").gender(Gender.FEMALE).educationDegree(EducationDegree.MASTER).
            martialStatus(MaritalStatus.WIDOWED).email("cl.gmail.com").address("Casterly Rock").phoneNumber("+3808555622").postNumber(18222).id(3).age(35).
            amountOfChildren(3).idCardNumber(12221222).healthInsuranceNumber(122122)
            .dateOfRegistration("2022-03-12").build();
    Customer customer4 = new Customer.Builder("Tyrion", "Lannister").gender(Gender.MALE).educationDegree(EducationDegree.BACHELOR).
            martialStatus(MaritalStatus.SINGLE).email("tl.gmail.com").address("Casterly Rock").phoneNumber("+3808555633").postNumber(18333).id(4).age(33).
            amountOfChildren(0).idCardNumber(155675561).healthInsuranceNumber(133133)
            .dateOfRegistration("2022-03-12").build();
    Customer customer5 = new Customer.Builder("Jon", "Snow").gender(Gender.MALE).educationDegree(EducationDegree.MASTER).
            martialStatus(MaritalStatus.SINGLE).email("js.gmail.com").address("Winterfell").phoneNumber("+38085990077").postNumber(18000).id(5).age(30).
            amountOfChildren(0).idCardNumber(12221222).healthInsuranceNumber(122122)
            .dateOfRegistration("2022-03-12").build();
    Customer customer6 = new Customer.Builder("Daenerys", "Targaryen").gender(Gender.FEMALE).educationDegree(EducationDegree.MASTER).
            martialStatus(MaritalStatus.WIDOWED).email("dt.gmail.com").address("Dragonstone").phoneNumber("+380888888").postNumber(19000).id(6).age(28).
            amountOfChildren(0).idCardNumber(10001766).healthInsuranceNumber(100000)
            .dateOfRegistration("2022-03-12").build();
    Customer customer7 = new Customer.Builder("Jaqen", "H’ghar").gender(Gender.MALE).educationDegree(EducationDegree.JUNIOR_SPECIALIST).
            martialStatus(MaritalStatus.SINGLE).email("jh.gmail.com").address("Lorath").phoneNumber("+380679005544").postNumber(11000).id(7).age(32).
            amountOfChildren(0).idCardNumber(10001766).healthInsuranceNumber(100000)
            .dateOfRegistration("2020-05-24").build();
    Customer customer8 = new Customer.Builder("Viserys", "Targaryen").gender(Gender.MALE).educationDegree(EducationDegree.BACHELOR).
            martialStatus(MaritalStatus.WIDOWED).email("dt.gmail.com").address("Dragonstone").phoneNumber("+380888888").postNumber(19000).id(8).age(30).
            amountOfChildren(0).idCardNumber(10001766).healthInsuranceNumber(100000)
            .dateOfRegistration("2022-03-12").build();
    Customer customer9 = new Customer.Builder("Margaery", "Tyrell").gender(Gender.FEMALE).educationDegree(EducationDegree.BACHELOR).
            martialStatus(MaritalStatus.WIDOWED).email("dt.gmail.com").address("Highgarden").phoneNumber("+380787959").postNumber(15000).id(9).age(16).
            amountOfChildren(0).idCardNumber(15501766).healthInsuranceNumber(100480)
            .dateOfRegistration("2023-01-02").build();
    Customer customer10 = new Customer.Builder("Oberyn", "Martell").gender(Gender.MALE).educationDegree(EducationDegree.MASTER).
            martialStatus(MaritalStatus.MARRIED).email("om.gmail.com").address("Dorne").phoneNumber("+380787999").postNumber(12000).id(10).age(31).
            amountOfChildren(0).idCardNumber(15501766).healthInsuranceNumber(1004111)
            .dateOfRegistration("2020-01-11").build();
    Customer customer11 = new Customer.Builder("Melisandre", "").gender(Gender.FEMALE).educationDegree(EducationDegree.JUNIOR_SPECIALIST).
            martialStatus(MaritalStatus.SINGLE).email("m.gmail.com").address("Asshai").phoneNumber("+38067543211").postNumber(66000).id(11).age(180).
            amountOfChildren(0).idCardNumber(1660660).healthInsuranceNumber(11100666)
            .dateOfRegistration("1988-01-11").build();
    Customer customer12 = new Customer.Builder("Stannis", "Baratheon").gender(Gender.MALE).educationDegree(EducationDegree.BACHELOR).
            martialStatus(MaritalStatus.MARRIED).email("sb.gmail.com").address("Storm's End").phoneNumber("+380287954").postNumber(14000).id(12).age(46).
            amountOfChildren(1).idCardNumber(15501880).healthInsuranceNumber(100444)
            .dateOfRegistration("2022-12-02").build();
    List<Customer> customers = Arrays.asList(customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8, customer9, customer10, customer11, customer12);

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
            sb.append("<tr>").append("<td>" + customer.getName() + "</td>")
                    .append("<td>" + customer.getLastName() + "</td>")
                    .append("<td>" + customer.getGender().toString() + "</td>")
                    .append("<td>" + customer.getEducationDegree().toString() + "</td>")
                    .append("<td>" + customer.getMaritalStatus().toString() + "</td>")
                    .append("<td>" + customer.getEmail() + "</td>")
                    .append("<td>" + customer.getAddress() + "</td>")
                    .append("<td>" + customer.getPhoneNumber() + "</td>")
                    .append("<td>" + customer.getPostNumber() + "</td>")
                    .append("<td>" + customer.getId() + "</td>")
                    .append("<td>" + customer.getAge() + "</td>")
                    .append("<td>" + customer.getAmountOfChildren() + "</td>")
                    .append("<td>" + customer.getIdCardNumber() + "</td>")
                    .append("<td>" + customer.getHealthInsuranceNumber() + "</td>")
                    .append("<td>" + customer.getDateOfRegistration() + "</td>")
                    .append("</tr>");
        }
        return sb.toString();
    }


}
