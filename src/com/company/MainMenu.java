package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainMenu {
    private Scanner input = new Scanner(System.in);

    protected void createCar() {


        System.out.println("what car would you like to create");
        System.out.println(" 1.Custom car \n 2.Ready to go\n 3.Exit");

        try {
            switch (input.nextInt()) {
                case 1:
                    Car car = new Car();
                    car.getCarInfo();
                    menu(car);
                    break;
                case 2:
                    Corvette corvette = new Corvette(2018, "Corvette", "Z06", 0, 100, "all black");
                    corvette.getCorvetteInfo();
                    menu(corvette);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please input a number 1 through 3");
                    createCar();

            }


        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please Enter a number 1 through 3");
            createCar();
        }
    }

    public void menu(Car car) {
        System.out.println("what would you like to do with the" + " " + car.getMake() + " " + car.getModel() + "?");
        System.out.println(" 1.Accelerate \n " + "2.Deccelerate \n " + "3.Fill up with gas \n" + " 4.Exit");


    try{


        switch (input.nextInt()) {
            case 1:
                //Accelerate
                car.driveCar(car);
                break;
            case 2:
                // Deccelerate
                car.deccelerate(car);
                break;
            case 3:
                // fill up with gas
                car.addGas(car);
                break;
            case 4:
                //exit
                System.exit(0);
                break;

            default:
                System.out.println("Please enter a number between 1 and 4");
                menu(car);

        }
    }catch(InputMismatchException ime) {
        input.nextLine();
        System.out.println("Please enter a number between 1 and 4");

        menu(car);
    }
}
    }

