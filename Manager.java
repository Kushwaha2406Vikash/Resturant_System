package com.resturant_system;

public class Manager extends Staff {
    public Manager(int id, String name, String email, String phone, int staffId) {
        super(id, name, email, phone, staffId, "Manager");
    }

    public boolean login() {
        System.out.println("Manager logged in: " + name);
        return true;
    }

    public void logout() {
        System.out.println("Manager logged out: " + name);
    }

    public void manageMenu() {
        System.out.println("Manager is managing the menu");
    }

    public void viewSalesReport() {
        System.out.println("Manager is viewing sales report");
    }
}
