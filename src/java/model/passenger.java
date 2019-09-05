/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author theji
 */
public class passenger {
    private String firstName, lastName, mobileNo,email, ticketType, address, bookingId, departureID,date;
    private int numOfTickets;

    public passenger() {
    }

    public passenger(String firstName, String lastName, String mobileNo, String email, String ticketType, String address, String bookingId, String date, int numOfTickets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.email = email;
        this.ticketType = ticketType;
        this.address = address;
        this.bookingId = bookingId;
        this.date = date;
        this.numOfTickets = numOfTickets;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
        

    public passenger(String departureID) {
        this.departureID = departureID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public String getTicketType() {
        return ticketType;
    }

    public String getAddress() {
        return address;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getDepartureID() {
        return departureID;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setDepartureID(String departureID) {
        this.departureID = departureID;
    }

    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    
}
