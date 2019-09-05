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
        <title>Payments</title>
    </head>
    <body>
        <h1>FILL IN DETAILS</h1>
        <form action="userController" method="post">            
            <input type="hidden" name="command" value="PAY"/>
            <h4>Card No.</h4>            
            <input type="text" name="cNumber"/>
            <h4>Card Holder Name</h4>
            <input type="text" name="cName"/>
            <h4>Validity till</h4>
            <input type="text" name="validity"/>
            <h4>CVV No.</h4>
            <input type="text" name="cvvNo"/>            
            <br><br>
            <input type="submit" value="PAY"/>
            <button><a href="searchFlight.jsp">Cancel</a></button>
        </form>
    </body>
</html>
