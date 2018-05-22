<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/12 0012
  Time: 上午 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>All Employees in System</h2>

<table border="1">
    <tr>
        <th>Employee Id</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.firstName}</td>
            <td>${employee.lastName}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
