package com.example.RecepBorekciQaracter_assignment_4.services;

import com.example.RecepBorekciQaracter_assignment_4.entities.Appointment;
import com.example.RecepBorekciQaracter_assignment_4.entities.Customer;
import com.example.RecepBorekciQaracter_assignment_4.exceptions.InvalidAppointmentException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppointmentService {
    private final List<Appointment> appointments = new ArrayList<>();
    private Long nextId = 1L;
    public AppointmentService() {
        appointments.add(new Appointment(nextId++, 1L, "2025-12-12", "CHECKUP", "ACTIVE"));
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public Appointment getAppointmentById(Long id) {
        return appointments.stream()
                .filter(appointment -> appointment.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Appointment createAppointment(Appointment appointment) {
        boolean slotTaken = appointments.stream()
                .anyMatch(a -> a.getDateTime().equals(appointment.getDateTime()));

        if (slotTaken) {
            throw new InvalidAppointmentException(
                    "Appointment slot is not available: " + appointment.getDateTime()
            );
        }

        appointment.setId(this.nextId++);
        appointments.add(appointment);
        return appointment;
    }


    public List<Appointment> getAppointmentsByCustomer(Long customerId) {
        return appointments.stream()
                .filter(appointment -> appointment.getCustomerId().equals(customerId))
                .collect(Collectors.toList());
    }

    public Appointment updateAppointmentStatus(Long id, String newStatus) {
        Appointment appointment = getAppointmentById(id);

        if (appointment == null) {
            return null;
        }

        appointment.setStatus(newStatus);
        return appointment;
    }

    public Appointment cancelAppointment(Long id) {
        return updateAppointmentStatus(id, "CANCELED");
    }
}

