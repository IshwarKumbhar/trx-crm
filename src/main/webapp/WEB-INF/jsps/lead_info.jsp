<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead info</title>
</head>
<body>
<h2>Lead Info</h2>
 First Name:${lead.firstname}<br/>
 Last Name:${lead.lastname}<br/>
 Email:${lead.email}<br/>
 Mobile:${lead.mobile}<br/>
 Lead Source:${lead.leadsource}<br/>
 Gender:${lead.gender}<br/>
  <form action="convertlead" method="post">
  <input type="hidden" name="id" value="${lead.id}"/>
 <input type="submit" value="convert"/>
 </form>
</body>
</html>