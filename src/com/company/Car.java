package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.mainMenu;

public class Car extends Vehicle {


    private Scanner input = new Scanner(System.in);
    private int year;
    private String make;
    private String model;
    private int speed = 0;
    private int gas = 100;


    public Car() {

        setMake();
        setModel();
        setYear();
        setSpeed(0);
        setGas(100);

    }


    public Car(int year, String make, String model, int speed, int gas) {
        super(year, make, model);

        this.speed = speed;
        this.gas = gas;
    }


    public Car(int speed) {
        this.speed = speed;
    }


  

    public void setYear() {
        System.out.println("What is the year of the Car you would like to make?");
        try {
            super.setYear(input.nextInt());
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number for the year.");

            setYear();
        }
    }



    public void setMake() {
        System.out.println("What is the make of the Car you would like to create?");
        super.setMake(input.nextLine());
    }



    public void setModel() {
        System.out.println("What is the model of the Car you would like to create?");
        super.setModel(input.nextLine());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void getCarInfo() {
        System.out.println("The Current Car is a " + getMake() + " " + getModel() + ". It is going " + getSpeed() + " MPH and has " + getGas() + "% of its gas left.");
    }


    public void driveCar(Car car) {

        for (int seconds = 0; seconds <= 5; seconds++) {

            car.setSpeed(car.getSpeed() + 1);

            car.setGas(car.getGas() - 1);

            System.out.println("the " + car.getMake() + "is going " + car.getSpeed() + "Mph and has  " + car.getGas() + "  % of gas");

        }
        mainMenu.menu(car);

    }

    public void deccelerate(Car car) {

        for (int seconds = 0; seconds <= 5; seconds++) {

            car.setSpeed(car.getSpeed() -1 );

            car.setGas(car.getGas() -1 );

            System.out.println("the " + car.getMake() + "is going " + car.getSpeed() + "Mph and has  " + car.getGas() + "  % of gas");
        }
        mainMenu.menu(car);

    }


    public void addGas(Car car) {
        car.setGas(100);
        System.out.println(" Your" + car.getMake() + "" + car.getModel() + " now has a full tank");

        mainMenu.menu(car);
    }
}




























