<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing</title>
</head>
<body>
<h2>bill| Create</h2>
<form action="saveBill" method="post">
<pre>
First Name<input type="text" name="firstname" value="${contact.firstname}"/>
Last Name<input type="text" name="lastname" value="${contact.lastname }"/>
Email<input type="text" name="email" value="${contact.email}"/>
Mobile<input type="text" name="mobile" value="${contact.mobile}"/>
product Name<input type="text" name="productname"/>
Amount<input type="text" name="amount"/>
<input type="submit" value="billing"/>
</pre>
</form>
</body>
</html>