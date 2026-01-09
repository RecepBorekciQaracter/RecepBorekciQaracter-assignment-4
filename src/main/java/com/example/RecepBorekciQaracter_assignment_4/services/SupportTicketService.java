package com.example.RecepBorekciQaracter_assignment_4.services;

import com.example.RecepBorekciQaracter_assignment_4.entities.SupportTicket;
import com.example.RecepBorekciQaracter_assignment_4.exceptions.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SupportTicketService {

    private final List<SupportTicket> tickets = new ArrayList<>();
    private Long nextId = 1L;

    public SupportTicketService() {
        tickets.add(new SupportTicket(
                nextId++,
                "Login issue",
                "Cannot login to the system",
                "HIGH",
                "Support Team",
                "OPEN"
        ));
    }

    public List<SupportTicket> getTickets() {
        return tickets;
    }

    public SupportTicket getTicketById(Long id) {
        return tickets.stream()
                .filter(ticket -> ticket.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public SupportTicket createTicket(SupportTicket ticket) {
        ticket.setId(this.nextId++);
        tickets.add(ticket);
        return ticket;
    }

    public List<SupportTicket> getTicketsByStatus(String status) {
        return tickets.stream()
                .filter(ticket -> ticket.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public List<SupportTicket> getOpenTickets() {
        return getTicketsByStatus("OPEN");
    }

    public SupportTicket updateTicketStatus(Long id, String newStatus) {
        SupportTicket ticket = getTicketById(id);

        if (ticket == null) {
            return null;
        }

        ticket.setStatus(newStatus);
        return ticket;
    }

    public SupportTicket assignTicket(Long id, String assignedTo) {
        List<String> validEmployees = List.of("Support Team", "Admin", "Technician");

        if (!validEmployees.contains(assignedTo)) {
            throw new EmployeeNotFoundException(
                    "Employee not found: " + assignedTo
            );
        }
        SupportTicket ticket = getTicketById(id);

        if (ticket == null) {
            return null;
        }

        ticket.setAssignedTo(assignedTo);
        return ticket;
    }

    public SupportTicket closeTicket(Long id) {
        return updateTicketStatus(id, "CLOSED");
    }
}
