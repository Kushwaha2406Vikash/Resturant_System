package com.resturant_system;

// Payment class
import java.time.LocalDateTime;

public class Payment {
    private int paymentId;
    private Order order;
    private double amount;
    private String paymentType;
    private LocalDateTime paymentTime;
    private String status;

    public Payment(int paymentId, Order order, String paymentType) {
        this.paymentId = paymentId;
        this.order = order;
        this.amount = order.calculateTotal();
        this.paymentType = paymentType;
        this.paymentTime = LocalDateTime.now();
        this.status = "PENDING";
    }

    public boolean processPayment() {
        System.out.println("Processing payment of $" + amount + " for Order#" + order + " using " + paymentType);
        this.status = "SUCCESS";
        return true;
    }
}
