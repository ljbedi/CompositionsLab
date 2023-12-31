package com.codebase;

public class Vehicle {
    private double price;
    private String color;
    private Engine engine;
    private int numTyres;

    private VehicleType vehicleType;

    private TyreType tyreType;

    public Vehicle(double price, String color, Engine engine, VehicleType vehicleType, TyreType tyreType) {
        this.price = price;
        this.color = color;
        this.engine = engine;
        this.vehicleType = vehicleType;
        this.numTyres = this.vehicleType.getNumTyres();
        this.tyreType = tyreType;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getNumTyres() {
        return numTyres;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public TyreType getTyreType() {
        return tyreType;
    }
}
