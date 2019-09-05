<%-- 
    Document   : searchedFlightResults
    Created on : Sep 1, 2019, 4:45:06 PM
    Author     : theji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="CSS/style.css">
        <title>Flights</title>
    </head>
    <body>
        <h3>GreenLine Airways</h3>
        <table>
            <tr>
                <th>Flight Number</th>              
                <th>Flight Name</th>
                <th>Departure Airport</th>
                <th>Arrival Airport</th>
                <th>Duration For Journey</th>                                            
                <th>Departure Time (hrs)</th>
                <th>Departure Date</th>
                <th>Economy Ticket Price (US$)</th>
                <th>Business Ticket Price (US$)</th>
                <th>First Class Ticket Price (US$)</th>
                
            </tr>
            <c:forEach var="tempDetails" items="${FLIGHT_LIST}">
                <c:url var="reserveLink" value="userController">
                    <c:param name="command" value="BOOK"/>
                    <c:param name="departureId" value="${tempDetails.flightNumber}"/>
                </c:url>>                
                <tr>
                    <td>${tempDetails.flightNumber}</td>
                    <td>${tempDetails.flightName}</td>
                    <td>${tempDetails.departureAirport}</td>
                    <td>${tempDetails.arrivalAirport}</td>
                    <td>${tempDetails.durationForJourney}</td>                    
                    <td>${tempDetails.departureTime}</td>
                    <td>${tempDetails.departureDate}</td>
                    <td>${tempDetails.economyTicketPrice}</td>
                    <td>${tempDetails.businessTicketPrice}</td>
                    <td>${tempDetails.firstClassTicketPrice}</td>
                    
                    <td><a href ="${reserveLink}"> Continue </a></td>
                </tr>
            </c:forEach>>
        </table>
    </body>
</html>
