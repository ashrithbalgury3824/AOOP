package lab6_iii;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerSupportTicketSystem {
    private Queue<Ticket> ticketQueue;

    public CustomerSupportTicketSystem() {
        this.ticketQueue = new LinkedList<>();
    }

    public void addTicket(Ticket ticket) {
        ticketQueue.add(ticket);
        System.out.println("Ticket added successfully!");
    }

    public void processNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
            return;
        }
        Ticket ticket = ticketQueue.remove();
        System.out.println("Processing ticket: " + ticket.getDescription());
    }

    public void displayPendingTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
            return;
        }
        System.out.println("Pending tickets:");
        for (Ticket ticket : ticketQueue) {
            System.out.println(ticket.getDescription());
        }
    }
}