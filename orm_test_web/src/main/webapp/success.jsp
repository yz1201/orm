<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/9
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <table class="table table-bordered table-hover table-success">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>ProductNum</th>
            <th>ProductName</th>
            <th>CityName</th>
            <th>DepartureTime</th>
            <th>ProductPrice</th>
            <th>ProductDesc</th>
            <th>ProductStatus</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${products}" var="pro" varStatus="s">
            <tr>
                <td>${pro.id}</td>
                <td>${pro.productNum}</td>
                <td>${pro.productName}</td>
                <td>${pro.cityName}</td>
                <td>${pro.departureTime}</td>
                <td>${pro.productPrice}</td>
                <td>${pro.productDesc}</td>
                <td>${pro.productStatus}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
