<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing list</title>
</head>
<body>
<h2> all|Billing search result</h2>
<table>
<tr>
      <th>FirStname</th>
      <th>LastName</th>
      <th>Email</th>
      <th>Mobile</th>
      <th>LeadSource</th>
      <th>Gender</th>
      <th>Billing</th>
      <th>amount</th>
</tr>
  <c:forEach items="${billing}" var="bill">
<tr>
 <td>${bill.firstname}</td>
 <td>${bill.lastname}</td>
 <td>${bill.email}</td>
 <td>${bill.mobile}</td>
 <td>${bill.leadsource}</td>
 <td>${bill.gender}</td>
 <td>${bill.productname}</td>
 <td>${bill.amount}</td>
</tr>
</c:forEach>
</table>
</body>
</html>