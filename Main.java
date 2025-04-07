package com.resturant_system;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create sample users
        Customer customer = new Customer(1, "Alice", "alice@example.com", "1234567890");
        Waiter waiter = new Waiter(2, "Bob", "bob@restaurant.com", "1112223333", 101);
        Chef chef = new Chef(3, "Charlie", "charlie@restaurant.com", "4445556666", 102);
        Manager manager = new Manager(4, "Diana", "diana@restaurant.com", "7778889999", 103);

        // Login flow
        customer.login();
        waiter.login();
        chef.login();
        manager.login();

        // Manager manages menu
        manager.manageMenu();

        // Create MenuItems
        MenuItem pizza = new MenuItem(201, "Pizza", "Cheese burst", 9.99, "Main Course");
        MenuItem soda = new MenuItem(202, "Soda", "Cold Drink", 1.99, "Beverage");

        // Customer browses menu and places order
        customer.browseMenu();
        Order order = new Order(301, customer, Arrays.asList(pizza, soda), LocalDateTime.now());
        customer.placeOrder(order);

        // Waiter takes order
        waiter.takeOrder(order);

        // Chef prepares the order
        chef.prepareOrder(order);

        // Waiter updates order status to served
        waiter.updateOrderStatus(order, "SERVED");

        // Payment is processed
        Payment payment = new Payment(401, order, "Credit Card");
        payment.processPayment();

        // Table reservation
        Table table = new Table(501, 4);
        Reservation reservation = new Reservation(601, customer, table, LocalDateTime.now().plusDays(1), 90);
        customer.reserveTable(reservation);
        reservation.confirmReservation();

        // Inventory Management
        InventoryItem cheese = new InventoryItem(701, "Cheese", 50, "kg");
        cheese.deductStock(10);
        cheese.addStock(20);

        // Manager views sales report
        manager.viewSalesReport();

        // Logout flow
        customer.logout();
        waiter.logout();
        chef.logout();
        manager.logout();
    }
}

