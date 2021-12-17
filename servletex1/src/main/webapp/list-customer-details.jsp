<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ page import="java.util.*" %>
    <%@ page import="com.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer list</title>
</head>
<body>

<div>
<%
                     List<Customer> list=(ArrayList<Customer>) request.getAttribute("list");
                     out.println(list);

%>


</div>
</body>
</html>