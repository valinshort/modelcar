package com.company;

public abstract class Vehicle {
    private int year;
    private String make;
    private String model;

    public Vehicle(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle() {
    }

    public void getVehicleInfo() {
        System.out.println("The current vehicle is" + getYear() + " " + getMake() + " " + getModel());
    }
}




