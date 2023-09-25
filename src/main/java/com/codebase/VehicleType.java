package com.codebase;

public enum VehicleType {

    CAR(4),
    MOTORBIKE(2),
    TANK(6);

    private int numTyres;

    VehicleType(int numTyres) {
        this.numTyres = numTyres;
    }

    public int getNumTyres() {
        return numTyres;
    }


}
