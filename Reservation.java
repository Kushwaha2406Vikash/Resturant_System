package com.resturant_system;

import java.time.LocalDateTime;

public class Reservation {
    private int reservationId;
    private Customer customer;
    private Table table;
    private LocalDateTime reservationTime;
    private int durationInMinutes;

    public Reservation(int reservationId, Customer customer, Table table, LocalDateTime reservationTime, int durationInMinutes) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.table = table;
        this.reservationTime = reservationTime;
        this.durationInMinutes = durationInMinutes;
    }

    public boolean confirmReservation() {
        boolean confirmed = table.reserve();
        System.out.println("Reservation " + reservationId + (confirmed ? " confirmed." : " failed."));
        return confirmed;
    }

    public void cancelReservation() {
        table.release();
        System.out.println("Reservation " + reservationId + " cancelled.");
    }

    public Table getTable() {
        return table;
    }
}
