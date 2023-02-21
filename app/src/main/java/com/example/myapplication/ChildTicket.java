package com.example.myapplication;

public class ChildTicket  extends Ticket {

    private float ticketDiscount;

    public ChildTicket(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public ChildTicket(float price, String deliveryPoint, String deliveryTime, int distance, String departureTime, String departurePoint) {
        super(price, deliveryPoint, deliveryTime, distance, departureTime, departurePoint);
    }

    public float countTicketPrice() {
        return (getPrice() * getNumberOfTickets() * (100 - ticketDiscount)) / 100;
    }
}
