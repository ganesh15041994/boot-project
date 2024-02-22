<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
<%
/* String name=(String)request.getAttribute("name");
LocalDateTime n =(LocalDateTime) request.getAttribute("date"); */
%>
<h1>My Name Is ${name }</h1>
<%-- <h2>Date is${date.toString()} </h2> --%>
${col }
<hr>

<c:forEach var="item" items="${col }" >

<h1>${item }</h1>
<c:out value="${item}"></c:out>

</c:forEach>
</body>
</html>