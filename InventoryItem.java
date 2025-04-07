package com.resturant_system;

public class InventoryItem {
    private int itemId;
    private String name;
    private int quantity;
    private String unit;

    public InventoryItem(int itemId, String name, int quantity, String unit) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public void addStock(int amount) {
        this.quantity += amount;
        System.out.println("Added " + amount + " " + unit + " of " + name);
    }

    public boolean deductStock(int amount) {
        if (this.quantity >= amount) {
            this.quantity -= amount;
            System.out.println("Deducted " + amount + " " + unit + " of " + name);
            return true;
        }
        System.out.println("Insufficient stock to deduct " + amount + " of " + name);
        return false;
    }
}

