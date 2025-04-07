package com.resturant_system;

// Order class
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<MenuItem> items;
    private double totalAmount;
    private String status;
    private LocalDateTime orderTime;

    public Order(int orderId, Customer customer, List<MenuItem> items, LocalDateTime orderTime) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.orderTime = orderTime;
        this.totalAmount = calculateTotal();
        this.status = "PENDING";
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public void updateStatus(String status) {
        this.status = status;
        System.out.println("Order " + orderId + " status updated to: " + status);
    }

    @Override
    public String toString() {
        return "Order#" + orderId + " Total: $" + totalAmount + " Status: " + status;
    }
}


