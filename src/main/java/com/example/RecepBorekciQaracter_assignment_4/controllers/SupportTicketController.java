package com.example.RecepBorekciQaracter_assignment_4.controllers;

import com.example.RecepBorekciQaracter_assignment_4.entities.SupportTicket;
import com.example.RecepBorekciQaracter_assignment_4.services.SupportTicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/support-tickets")
public class SupportTicketController {
    private final SupportTicketService supportTicketService;

    public SupportTicketController(SupportTicketService supportTicketService) {
        this.supportTicketService = supportTicketService;
    }

    @GetMapping
    public List<SupportTicket> getSupportTickets() {
        return supportTicketService.getTickets();
    }

    @GetMapping("/{id}")
    public SupportTicket getSupportTicketById(@PathVariable Long id) {
        return supportTicketService.getTicketById(id);
    }

    @PostMapping
    public SupportTicket createTicket(@RequestBody SupportTicket supportTicket) {
        return supportTicketService.createTicket(supportTicket);
    }

    @GetMapping("/status/{status}")
    public List<SupportTicket> getTicketsByStatus(@PathVariable String status) {
        return supportTicketService.getTicketsByStatus(status);
    }


    @GetMapping("/open")
    public List<SupportTicket> getOpenTickets() {
        return supportTicketService.getOpenTickets();
    }

    @PutMapping("/{id}/status")
    public SupportTicket updateTicketStatus(@PathVariable Long id, @RequestParam String status) {
        return supportTicketService.updateTicketStatus(id, status);
    }

    @PutMapping("/{id}/assign")
    public SupportTicket assignTicket(@PathVariable Long id, @RequestParam String assignedTo) {
        return supportTicketService.assignTicket(id, assignedTo);
    }

    @PutMapping("/{id}/close")
    public SupportTicket closeTicket(@PathVariable Long id) {
        return supportTicketService.closeTicket(id);
    }
}
