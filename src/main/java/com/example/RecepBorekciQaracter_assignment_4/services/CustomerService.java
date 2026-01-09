package com.example.RecepBorekciQaracter_assignment_4.services;

import com.example.RecepBorekciQaracter_assignment_4.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private final List<Customer> customers = new ArrayList<>();
    private Long nextId = 1L;
    public CustomerService() {
        customers.add(new Customer(nextId++, "Recep", "recep@gmail.com", "5849845484"));
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomerById(Long id) {
        return customers.stream() // Streams through the task list
                .filter(task -> task.getId().equals(id)) // Filters tasks by ID
                .findFirst() // Returns the first match (if any)
                .orElse(null);
    }

    public Customer createCustomer(Customer customer) {
        customer.setId(this.nextId++);
        this.customers.add(customer);
        return customer;
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        Customer customer = getCustomerById(id);

        if (customer == null) {
            return null;
        }

        customer.setFullName(updatedCustomer.getFullName());
        customer.setEmail(updatedCustomer.getEmail());
        customer.setPhoneNumber(updatedCustomer.getPhoneNumber());

        return customer;
    }

    public void deleteCustomer(Long id) {
        customers.removeIf(customer -> customer.getId().equals(id));
    }
}
