package com.resturant_system;

import java.util.UUID;

public class Customer extends User {
    public Customer(int id, String name, String email, String phone) {
        super(id, name, email, phone);
    }

    public boolean login() {
        System.out.println("Customer logged in: " + name);
        return true;
    }

    public void logout() {
        System.out.println("Customer logged out: " + name);
    }

    public void browseMenu() {
        System.out.println("Customer is browsing the menu");
    }

    public void placeOrder(Order order) {
        System.out.println("Order placed by customer: " + order);
    }

    public void reserveTable(Reservation reservation) {
        System.out.println("Reservation made by customer: " + reservation);
    }
}
