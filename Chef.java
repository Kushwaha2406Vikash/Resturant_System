package com.resturant_system;

// Chef class
public class Chef extends Staff {
    public Chef(int id, String name, String email, String phone, int staffId) {
        super(id, name, email, phone, staffId, "Chef");
    }

    public boolean login() {
        System.out.println("Chef logged in: " + name);
        return true;
    }

    public void logout() {
        System.out.println("Chef logged out: " + name);
    }

    public void prepareOrder(Order order) {
        System.out.println("Chef is preparing order: " + order);
        order.updateStatus("PREPARED");
    }
}
