package com.resturant_system;

// Waiter class
public class Waiter extends Staff {
    public Waiter(int id, String name, String email, String phone, int staffId) {
        super(id, name, email, phone, staffId, "Waiter");
    }

    public boolean login() {
        System.out.println("Waiter logged in: " + name);
        return true;
    }

    public void logout() {
        System.out.println("Waiter logged out: " + name);
    }

    public void takeOrder(Order order) {
        System.out.println("Waiter is taking order: " + order);
        order.updateStatus("TAKEN_BY_WAITER");
    }

    public void updateOrderStatus(Order order, String status) {
        System.out.println("Order status updated to " + status + " by Waiter");
        order.updateStatus(status);
    }
}
