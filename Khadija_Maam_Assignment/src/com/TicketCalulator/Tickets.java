package com.TicketCalulator;

public class Tickets {
	private int ticketId;
	private int price;
	private static int availableTickets ;
	private int nTickets;

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public  void setAvailableTickets(int availableTicket) {
		availableTickets = availableTicket;
	}

	public void setNTicket(int nTicket) {
		this.nTickets = nTicket;
	}

	public int getTicketId() {
		return ticketId;
	}

	public int getPrice() {
		return price;
	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public int getNTicket() {
		return nTickets;
	}

	public int available() {
		if(availableTickets > 0) {
			availableTickets = getAvailableTickets() - getNTicket();
			System.out.println("Available Tickets Afert Booking:" +availableTickets);
		}else {
			System.err.println("Sorry... Show is Housefull");
		}
		return availableTickets;
		
	}
	public int booking() {
		int booking = getNTicket()*getPrice();
		System.out.println("Total Amount::" +booking);
		return booking;
	}
	
}
