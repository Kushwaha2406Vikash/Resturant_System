package com.resturant_system;

public class MenuItem {
    private int itemId;
    private String name;
    private String description;
    private double price;
    private String category;

    public MenuItem(int itemId, String name, String description, double price, String category) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Price updated for item " + name + ": " + newPrice);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + category + "): $" + price;
    }
}
