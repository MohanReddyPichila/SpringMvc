<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Successfully Logged In::::</h2>

<table border="1">
<tr>
<th>EmpId</th><th>EmpName</th><th>EmpAddr</th>
</tr>
<c:forEach var="emp" items="${model}">
<tr>
<td> ${emp.empId }</td><td> ${emp.empName }</td><td> ${emp.empAddr }</td>
</tr>
</c:forEach>
</table>

</body>
</html>