/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author theji
 */
public class flight {
    private String flightNumber, flightName, departureAirport, arrivalAirport, durationForJourney, routeAndTransits, details,economyTicketPrice,businessTicketPrice,firstClassTicketPrice ;
    private Date departureDate;
    private String departureTime;
    private int numberOfEconomySeats, numberOfBusinessSeats, numberOfFirstClassSeats, 
            economyBaggageAllowance, economyCabinBaggage, businessBaggageAllowance, businessCabinBaggage, firstClassBaggageAllowance, firstClassCabinBaggage;

    public flight(String flightNumber, String flightName, String departureAirport, String arrivalAirport, String durationForJourney, String routeAndTransits, String details, Date departureDate, String departureTime, String economyTicketPrice, String businessTicketPrice, String firstClassTicketPrice, int numberOfEconomySeats, int numberOfBusinessSeats, int numberOfFirstClassSeats, int economyBaggageAllowance, int economyCabinBaggage, int businessBaggageAllowance, int businessCabinBaggage, int firstClassBaggageAllowance, int firstClassCabinBaggage) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.durationForJourney = durationForJourney;
        this.routeAndTransits = routeAndTransits;
        this.details = details;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.economyTicketPrice = economyTicketPrice;
        this.businessTicketPrice = businessTicketPrice;
        this.firstClassTicketPrice = firstClassTicketPrice;
        this.numberOfEconomySeats = numberOfEconomySeats;
        this.numberOfBusinessSeats = numberOfBusinessSeats;
        this.numberOfFirstClassSeats = numberOfFirstClassSeats;
        this.economyBaggageAllowance = economyBaggageAllowance;
        this.economyCabinBaggage = economyCabinBaggage;
        this.businessBaggageAllowance = businessBaggageAllowance;
        this.businessCabinBaggage = businessCabinBaggage;
        this.firstClassBaggageAllowance = firstClassBaggageAllowance;
        this.firstClassCabinBaggage = firstClassCabinBaggage;
    }

    public flight(String flightNumber, String flightName, String departureAirport, String arrivalAirport, String durationForJourney, String routeAndTransits, String details, String economyTicketPrice, String businessTicketPrice, String firstClassTicketPrice, Date departureDate ) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.durationForJourney = durationForJourney;
        this.routeAndTransits = routeAndTransits;
        this.details = details;
        this.economyTicketPrice=economyTicketPrice;
        this.businessTicketPrice=businessTicketPrice;
        this.firstClassTicketPrice=firstClassTicketPrice;
        this.departureDate=departureDate;
        
        
        
       
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDurationForJourney() {
        return durationForJourney;
    }

    public String getRouteAndTransits() {
        return routeAndTransits;
    }

    public String getDetails() {
        return details;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getEconomyTicketPrice() {
        return economyTicketPrice;
    }

    public String getBusinessTicketPrice() {
        return businessTicketPrice;
    }

    public String getFirstClassTicketPrice() {
        return firstClassTicketPrice;
    }

    public int getNumberOfEconomySeats() {
        return numberOfEconomySeats;
    }

    public int getNumberOfBusinessSeats() {
        return numberOfBusinessSeats;
    }

    public int getNumberOfFirstClassSeats() {
        return numberOfFirstClassSeats;
    }

    public int getEconomyBaggageAllowance() {
        return economyBaggageAllowance;
    }

    public int getEconomyCabinBaggage() {
        return economyCabinBaggage;
    }

    public int getBusinessBaggageAllowance() {
        return businessBaggageAllowance;
    }

    public int getBusinessCabinBaggage() {
        return businessCabinBaggage;
    }

    public int getFirstClassBaggageAllowance() {
        return firstClassBaggageAllowance;
    }

    public int getFirstClassCabinBaggage() {
        return firstClassCabinBaggage;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public void setDurationForJourney(String durationForJourney) {
        this.durationForJourney = durationForJourney;
    }

    public void setRouteAndTransits(String routeAndTransits) {
        this.routeAndTransits = routeAndTransits;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setEconomyTicketPrice(String economyTicketPrice) {
        this.economyTicketPrice = economyTicketPrice;
    }

    public void setBusinessTicketPrice(String businessTicketPrice) {
        this.businessTicketPrice = businessTicketPrice;
    }

    public void setFirstClassTicketPrice(String firstClassTicketPrice) {
        this.firstClassTicketPrice = firstClassTicketPrice;
    }

    public void setNumberOfEconomySeats(int numberOfEconomySeats) {
        this.numberOfEconomySeats = numberOfEconomySeats;
    }

    public void setNumberOfBusinessSeats(int numberOfBusinessSeats) {
        this.numberOfBusinessSeats = numberOfBusinessSeats;
    }

    public void setNumberOfFirstClassSeats(int numberOfFirstClassSeats) {
        this.numberOfFirstClassSeats = numberOfFirstClassSeats;
    }

    public void setEconomyBaggageAllowance(int economyBaggageAllowance) {
        this.economyBaggageAllowance = economyBaggageAllowance;
    }

    public void setEconomyCabinBaggage(int economyCabinBaggage) {
        this.economyCabinBaggage = economyCabinBaggage;
    }

    public void setBusinessBaggageAllowance(int businessBaggageAllowance) {
        this.businessBaggageAllowance = businessBaggageAllowance;
    }

    public void setBusinessCabinBaggage(int businessCabinBaggage) {
        this.businessCabinBaggage = businessCabinBaggage;
    }

    public void setFirstClassBaggageAllowance(int firstClassBaggageAllowance) {
        this.firstClassBaggageAllowance = firstClassBaggageAllowance;
    }

    public void setFirstClassCabinBaggage(int firstClassCabinBaggage) {
        this.firstClassCabinBaggage = firstClassCabinBaggage;
    }
    
    
    
    
    
}



//flightNumber VARCHAR(20) NOT NULL PRIMARY KEY,
//flightName VARCHAR(20) NOT NULL,
//departureAirport VARCHAR(30) NOT NULL,
//arrivalAirport VARCHAR(30) NOT NULL,
//date DATE NOT NULL,
//time TIME NOT NULL,
//economyTicketPrice INT NOT NULL,
//businessTicketPrice INT NOT NULL,
//firstClassTicketPrice INT NOT NULL,
//numberOfEconomySeats INT NOT NULL,
//numberOfBusinessSeats INT NOT NULL,
//numberOfFirstClassSeats INT NOT NULL,
//economyBaggageAllowance INT NOT NULL,
//economyCabinBaggage INT NOT NULL,
//businessBaggageAllowance INT NOT NULL,
//businessCabinBaggage INT NOT NULL,
//firstClassBaggageAllowance INT NOT NULL,
//firstClassCabinBaggage INT NOT NULL,
//durationForJourney VARCHAR(10) NOT NULL,
//routeAndTransits VARCHAR(200) NOT NULL,
//details VARCHAR(200)