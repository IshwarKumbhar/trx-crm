<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> contact|search result</h2>
<table>
<tr>
      <th>FirStname</th>
      <th>LastName</th>
      <th>Email</th>
      <th>Mobile</th>
      <th>LeadSource</th>
      <th>Gender</th>
      <th>Billing</th>
</tr>
  <c:forEach items="${contacts}" var="con">
<tr>
 <td><a href="getContactByid?id=${con.id}">${con.firstname}</a></td>
 <td>${con.lastname}</td>
 <td>${con.email}</td>
 <td>${con.mobile}</td>
 <td>${con.leadsource}</td>
 <td>${con.gender}</td>
 <td><a href="ganretedbill?id=${con.id}">billing</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>