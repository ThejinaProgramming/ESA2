
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dbOperations;
import model.flight;
import model.passenger;

/**
 *
 * @author theji
 */
public class userController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String command=request.getParameter("command");
            switch(command)
            {
                case "SEARCH":viewDetails(request,response);
                              break;
                case "BOOK":reserveFlight(request,response);
                              break;
                default:
                    break;
                
            }
        } catch (Exception ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String command=request.getParameter("command");
            switch(command)
            {
                case "VALIDATE":userValidation(request,response);
                            break;
                default:
                    break;
                
            }
        } catch (Exception ex) {
            Logger.getLogger(userController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    public void viewDetails(HttpServletRequest request, HttpServletResponse response)
            throws Exception{
        dbOperations operation1=new dbOperations();
        String departureAirport=request.getParameter("departureAirportName");
        String arrivalAirport=request.getParameter("arrivalAirportName");
        String departureDate=request.getParameter("departureDate");
        
        
        List<flight> searchedFlights=operation1.searchFlight(departureAirport, arrivalAirport, departureDate);
        request.setAttribute("FLIGHT_LIST", searchedFlights);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/searchedFlightResults.jsp");
        dispatcher.forward(request, response);
        
        
    }

    public void reserveFlight(HttpServletRequest request, HttpServletResponse response)throws Exception             
    {
        dbOperations operation2=new dbOperations();
        String flightNumber=request.getParameter("departureId");
        passenger p1=new passenger(flightNumber);
        passengerHandler(p1);
        
        RequestDispatcher dispatcher=request.getRequestDispatcher("/passengerDetails.jsp");
        dispatcher.forward(request, response);
        
    }
    
    public void userValidation(HttpServletRequest request, HttpServletResponse response)throws Exception  
    {
        passenger p2=new passenger();
        p2.setFirstName(request.getParameter("fName"));
        p2.setLastName(request.getParameter("lName"));
        p2.setMobileNo(request.getParameter("mNumber"));
        p2.setEmail(request.getParameter("email"));
        p2.setDate(request.getParameter("date"));
        p2.setTicketType(request.getParameter("optionBox"));
        String numberOfTickets=request.getParameter("tickets");
        p2.setNumOfTickets(Integer.parseInt(numberOfTickets));
        p2.setAddress(request.getParameter("address"));
        
        
    }
    
    public void passengerHandler(passenger p)
    {
        passenger traveller=new passenger();
        traveller.setDepartureID(p.getDepartureID());
    }

}
