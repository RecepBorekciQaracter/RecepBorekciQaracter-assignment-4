package com.example.RecepBorekciQaracter_assignment_4.controllers;

import com.example.RecepBorekciQaracter_assignment_4.entities.Appointment;
import com.example.RecepBorekciQaracter_assignment_4.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping
    public List<Appointment> getAppointments() {
        return appointmentService.getAppointments();
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/{customer_id}")
    public List<Appointment> getAppointmentsByCustomer(@PathVariable Long customer_id) {
        return appointmentService.getAppointmentsByCustomer(customer_id);
    }

    @PutMapping("/{id}")
    public Appointment updateAppointmentStatus(@PathVariable Long id, @RequestBody String newStatus) {
        return appointmentService.updateAppointmentStatus(id, newStatus);
    }

    @PutMapping("/id")
    public Appointment cancelAppointment(@PathVariable Long id) {
        return appointmentService.cancelAppointment(id);
    }
}
