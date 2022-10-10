<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact info</title>
</head>
<body>
<h2>contact Info</h2>
  First Name:${con.firstname}<br/>
 Last Name:${con.lastname}<br/>
 Email:${con.email}<br/>
 Mobile:${con.mobile}<br/>
 Lead Source:${con.leadsource}<br/>
 Gender:${con.gender}<br/>
</body>
</html>