<%@ page import="com.example.customerstable.Customer" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Volodymyr
  Date: 10.02.2023
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="styles/main.css">
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Last Name</th>
        <th>Gender</th>
        <th>Education Degree</th>
        <th>Martial Status</th>
        <th>Email</th>
        <th>Address</th>
        <th>Phone Number</th>
        <th>Post Number</th>
        <th>ID</th>
        <th>Age</th>
        <th>Amount Of Children</th>
        <th>ID Card Number</th>
        <th>Health Insurance Number</th>
        <th>Registration Date</th>
    </tr>
    </thead>
    <%
        Object s = request.getAttribute("customers");
        out.print(s);
    %>
</table>

</body>
</html>
