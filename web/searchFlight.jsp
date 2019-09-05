<%-- 
    Document   : searchFlight
    Created on : Sep 1, 2019, 1:59:10 PM
    Author     : theji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="CSS/style.css">
        <body background="image3.jpg" style="background-size: cover">
        <title>Flight Details</title>
    </head>
    <body>
        <h1>Welcome to Flight Booking</h1>
        <form action="userController" method="get">
            <input type="hidden" name="command" value="SEARCH"/>
            <h4>From</h4>            
            <input type="text" name="departureAirportName"/>
            <h4>To</h4>
            <input type="text" name="arrivalAirportName"/>
            <h4>Date</h4>
            <input type="date" name="departureDate">
            <br><br>
            <input type="submit" value="search">
        </form>
    </body>
</html>
