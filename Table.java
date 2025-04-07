package com.resturant_system;

public class Table {
    private int tableId;
    private int capacity;
    private boolean isAvailable;

    public Table(int tableId, int capacity) {
        this.tableId = tableId;
        this.capacity = capacity;
        this.isAvailable = true;
    }

    public boolean reserve() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Table " + tableId + " reserved");
            return true;
        }
        return false;
    }

    public void release() {
        isAvailable = true;
        System.out.println("Table " + tableId + " released");
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
