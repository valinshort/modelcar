package com.company;

import java.util.Scanner;

public class Corvette extends Car {


    private String color;


    public Corvette(int year, String make, String model, int speed, int gas, String color) {
        super(year, make, model, speed, gas);
        this.color = color;
    }

    public Corvette(int speed, String color) {
        super(speed);
        this.color = color;
    }

    public Corvette( String color) {

        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    protected void getCorvetteInfo() {
        System.out.println("you are driving a "+ getYear() + " " + getColor() + " " + getModel() + " " +  getMake() + " with "+ getGas() + " % of gas.");
    }
}
