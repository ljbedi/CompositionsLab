package com.codebase;

import java.util.ArrayList;

public class Customer {
    private double balance;
    private ArrayList<Vehicle> vehicles;

    public Customer(double balance, ArrayList<Vehicle> vehicles) {
        this.balance = balance;
        this.vehicles = vehicles;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }


}
