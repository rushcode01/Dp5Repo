package com.TicketCalulator;

import java.util.Scanner;

public class Booking {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Available Tickets: ");
		int aTickets = in.nextInt();
		Tickets t1 = new Tickets();
		t1.setAvailableTickets(aTickets);
		int a;
		int b;
		do {
		System.out.println("Enter the Ticketid: ");
		int ticketId = in.nextInt();
		System.out.println("Enter the Price: ");
		int tPrice = in.nextInt();
		System.out.println("Enter the no of Tickets: ");
		int nTicket = in.nextInt();
		
		
		t1.setTicketId(ticketId);
		t1.setPrice(tPrice);
		t1.setNTicket(nTicket);
		
		System.out.println( "Available Tickets : "+t1.getAvailableTickets());
//		System.out.println("Total Amount: " + (t1.getNTicket()*t1.getPrice()));
//		System.out.println("Available Tickets After Booking: " + t1.available);
		a = t1.booking();
		 b = t1.available();
		}while(b >= 0);
	}
}
