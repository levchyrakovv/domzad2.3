package com.example.myapplication;

public class PensionerTicket extends Ticket {

    private float ticketDiscount;

    public PensionerTicket(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public PensionerTicket(float price, String deliveryPoint, String deliveryTime, int distance, String departureTime, String departurePoint) {
        super(price, deliveryPoint, deliveryTime, distance, departureTime, departurePoint);
    }

    public float countTicketPrice() {
        return (getPrice() * getNumberOfTickets() * (100 - ticketDiscount)) / 100;
    }
}
