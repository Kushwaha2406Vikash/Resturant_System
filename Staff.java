package com.resturant_system;


public abstract class Staff extends User {
    protected int staffId;
    protected String role;

    public Staff(int id, String name, String email, String phone, int staffId, String role) {
        super(id, name, email, phone);
        this.staffId = staffId;
        this.role = role;
    }
}

