<%-- 
    Document   : passengerDetails
    Created on : Sep 1, 2019, 10:37:56 PM
    Author     : theji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="CSS/style.css">
        <title>Travelers</title>
    </head>
    <body background="image2.jpg" style="background-size: cover">
        <h1>FILL IN DETAILS</h1>
        <form action="userController" method="reserveFlight">            
            <input type="hidden" name="command" value="VALIDATE"/>
            <h4>First Name </h4>            
            <input type="text" name="fName"/>
            <h4>Last Name</h4>
            <input type="text" name="lName"/>
            <h4>Mobile Number</h4>
            <input type="text" name="mNumber"/>
            <h4>email Address</h4>
            <input type="text" name="email"/>
            <h4>Date</h4>
            <input type="date" name="date"/>
            <h4>Class</h4>
                    <select id="optionBox">
                        <option value="economy">Economy</option>
                        <option value="business">Business</option>
                        <option value="firstClass">First Class</option>        
                    </select>
            <h4>No. of Tickets </h4>            
            <input type="number" name="tickets"/>
            <h4>Address</h4>
            <input type="text" name="address"/>
            <br><br>
            <input type="submit" value="Process to Payment"/>
            <button><a href="searchFlight.jsp">Cancel</a></button>
        </form>
    </body>
</html>
