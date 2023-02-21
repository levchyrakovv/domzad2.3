package com.example.myapplication;

public class Ticket {

    private float  price;


    private String deliveryPoint;


    private String deliveryTime;


    private int distance;

    private String travelTime;

    private int numberOfTickets;


    private String departureTime;


    private String departurePoint;
    public Ticket(float ticketPrice, int numberOfTickets){
        this.price = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }


    public Ticket(float price, String deliveryPoint, String deliveryTime, int distance, String departureTime, String departurePoint ) {
        this.price = price;
        this.deliveryPoint = deliveryPoint;
        this.deliveryTime = deliveryTime;
        this.distance = distance;
        this.departureTime = departureTime;
        this.departurePoint = departurePoint;
    }


    public float getPrice(){
        return price;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public int getDistance() {
        return distance;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public float countTicketPrice(){
        return price * numberOfTickets;
    }
     public int getNumberOfTickets(){
        return numberOfTickets;
     }
     public String getTravelTime() {
        return travelTime;
     }

    @Override
    public String toString() {
        return "Билет:" +
                "Цена билета " + price + ", " +
                "Точка отправления: " + departurePoint + ", " +
                "Время отправления: " + departureTime + ", " +
                "Точка прибытия: " + deliveryPoint + ", " +
                "Время прибытия: " + departureTime + ", " +
                "Расстояние: " + distance;
    }
}
