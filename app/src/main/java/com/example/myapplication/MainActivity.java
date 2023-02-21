package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ticketOut;
    private TextView ticketChildOut;
    private TextView ticketTotalOut;
    private TextView ticketPensionerOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ticket ticket = new Ticket(70,9);

        Ticket childTickets = new ChildTicket(70,11,50);

        Ticket pensionerTickets = new PensionerTicket(70,11,30);

        childTickets.countTicketPrice();
        pensionerTickets.countTicketPrice();

        ticketOut = findViewById(R.id.ticketOut);
        ticketChildOut = findViewById(R.id.ticketChildOut);
        ticketPensionerOut = findViewById(R.id.ticketPensionerOut);
        ticketTotalOut = findViewById(R.id.ticketTotalOut);


        float overallPrice =  ticket.countTicketPrice();
        float overallChildPrice = childTickets.countTicketPrice();
        float overallPensionerPrice = pensionerTickets.countTicketPrice();

        ticketOut.setText(overallPrice + " монет");
        ticketChildOut.setText(overallChildPrice + " монет");
        ticketPensionerOut.setText(overallPensionerPrice + " монет");
        ticketTotalOut.setText((overallChildPrice + overallPrice) + " монет");

//        TextView ticketView = findViewById(R.id.ticket);

//        Ticket ticket = new Ticket(120, "Москва", "23:00", 2000, "20:00", "Казань");

//        ticketView.setText(ticket.toString());
    }
}