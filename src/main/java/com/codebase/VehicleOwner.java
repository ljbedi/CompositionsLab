package com.codebase;

import java.util.ArrayList;

public abstract class VehicleOwner {
    private double balance;
    private ArrayList<Vehicle> vehicles;

    public VehicleOwner(double balance, ArrayList<Vehicle> vehicles) {
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


