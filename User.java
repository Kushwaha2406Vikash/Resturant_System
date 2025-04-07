package com.resturant_system;

import java.util.UUID;

public abstract class User {
    protected int id;
    protected String name;
    protected String email;
    protected String phone;

    public User(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public abstract boolean login();
    public abstract void logout();
}