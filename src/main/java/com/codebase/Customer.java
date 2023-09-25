package com.codebase;

import java.util.ArrayList;

public class Customer {
    private double balance;
    private ArrayList<Vehicle> vehicle;

    public Customer(double balance, ArrayList<Vehicle> vehicle) {
        this.balance = balance;
        this.vehicle = vehicle;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }
}
