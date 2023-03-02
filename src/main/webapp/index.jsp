<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - List Customers</title>
</head>
<body>
<h2>List Customers</h2>
<table>
        <tr>
            <th>Full name</th>
            <th>Date of birth</th>
            <th>Address</th>
        </tr>
        <c:forEach items="${customer}" var="cus">
            <tr>
                <td>${cus.name}</td>
                <td><fmt:formatDate type="date" value="${cus.dateOfBirth}" /></td>
                <td>${cus.address}</td>
            </tr
        </c:forEach>
</table>
</body>
</html>