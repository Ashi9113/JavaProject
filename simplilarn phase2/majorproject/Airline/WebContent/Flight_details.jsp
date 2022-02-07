<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Details</title>
</head>
<body>
<%
 @SuppressWarnings("unchecked") 
 List<String[]> flights = (List<String[]>) 
session.getAttribute("flights"); 
 if (flights != null) { 
%><center>
<h1>Available Flights</h1>
</center>
<center>
 <table border="1">
 <tr>
 <th>Flight No</th>
 <th>Airline Name</th>
 <th>Price</th>
 <th>Travel Date</th>
 <th>Available Seats</th>
 <th>Book</th>
 </tr>
 <%
 for (String[] flight : flights) { 
 %>
 <tr>
 <td><%=flight[0]%></td>
 <td><%=flight[1]%></td>
 <td><%=flight[2]%></td>
 <td><%=flight[3]%></td>
 <td><%=flight[4]%></td>
 <td><a href=BookFlight.jsp>Click to Book</a></td>
 </tr>
 </table>
</center>
 
<%
 } 
%>
<%
 } else { 
%>
<h1>There are no available flights</h1>
<%
 } 
%>
</body>
</html>