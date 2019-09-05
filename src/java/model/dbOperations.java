/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.sql.Date;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author theji
 */
public class dbOperations {
    private Connection connection;
    
    public dbOperations()
    {
        connection=database.getConnection();
    }
    
    public List<flight> searchFlight(String departureAirportName, String arrivalAirportName, String departureDate) throws Exception
    {
               
        List<flight> depFlights=new ArrayList<flight>();
        PreparedStatement preparedStatement=connection.prepareStatement("select * from flightList1 where departureAirport=? && arrivalAirport=? && date=?");
        preparedStatement.setString(1, departureAirportName);
        preparedStatement.setString(2, arrivalAirportName);
        preparedStatement.setString(3, departureDate);
        
        ResultSet rs=preparedStatement.executeQuery();
        
        while(rs.next())
        {
            String flightNumber=rs.getString("flightNumber");
            String flightName=rs.getString("flightName");
            String departureAirport=rs.getString("departureAirport");
            String arrivalAirport=rs.getString("arrivalAirport");
            String durationForJourney=rs.getString("durationForJourney");
            String routeAndTransits=rs.getString("routeAndTransits");
            String details=rs.getString("details");
//            String departureTime=rs.toString("departureTime");
//            String economyTicketPrice=rs.getString("economyTicketPrice");
//            String businessTicketPrice=rs.getString("businessTicketPrice");
//            String firstClassTicketPrice=rs.getString("firstClassTicketPrice");

            int x=rs.getInt("economyTicketPrice");
            int y=rs.getInt("businessTicketPrice");
            int z=rs.getInt("firstClassTicketPrice");
            
            String economyTicketPrice=Integer.toString(x);
            String businessTicketPrice=Integer.toString(y);
            String firstClassTicketPrice=Integer.toString(z);
            Date departureDateFinal=rs.getDate("date");
            
//            String departureTime=departureTime1;
            flight flightDetail=new flight(flightNumber,flightName,departureAirport, arrivalAirport, durationForJourney, routeAndTransits, details, economyTicketPrice, businessTicketPrice, firstClassTicketPrice , departureDateFinal);
            depFlights.add(flightDetail);
            
        }
        return depFlights;
    }
}
        