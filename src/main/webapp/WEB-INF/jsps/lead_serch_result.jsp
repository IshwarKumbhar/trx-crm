<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>listall_lead</title>
</head>
<body>
<h2> lead|search result</h2>
<table>
<tr>
      <th>FirStname</th>
      <th>LastName</th>
      <th>Email</th>
      <th>Mobile</th>
      <th>LeadSource</th>
      <th>Gender</th>
</tr>
  <c:forEach items="${leads}" var="lead">
<tr>
 <th><a href="getLeadByid?id=${lead.id}">${lead.firstname}</a></th>
 <th>${lead.lastname}</th>
 <th>${lead.email}</th>
 <th>${lead.mobile}</th>
 <th>${lead.leadsource}</th>
 <th>${lead.gender}</th>
</tr>
</c:forEach>
</table>

</body>
</html>