package com.epam.task01.logic.program;

/**
 * This class has two methods
 * getPassengerCarChoice and getTruckCarChoice which sort and display a list of cars based on a client request.
 * Requests come from the Main class.
 * The data is obtained from the TaxiCompany class.
 *
 * @see com.epam.task01.main.Main#main(java.lang.String[])
 * @see com.epam.task01.logic.TaxiCompany
 */

import com.epam.task01.car.Minivan;
import com.epam.task01.car.Passenger;
import com.epam.task01.car.Truck;
import com.epam.task01.logic.TaxiCompany;

import java.util.Scanner;

public class Program {
    private static final int PASSENGERCARCHOICE = 4;
    private static final int MINIVANCARCHOICE = 7;
    private static final int TRUCKLOADCAPACITY = 5000;

    Scanner scanner = new Scanner(System.in);
    TaxiCompany taxiCompany = new TaxiCompany();

    public void getPassengerCarChoice() {

        System.out.println("How many passengers?");

        if (scanner.nextInt() <= PASSENGERCARCHOICE) {
            System.out.println("Choose a car");
            for (Passenger passengerCar : taxiCompany.getPassengerList()) {
                System.out.println(passengerCar);
            }
        } else if (scanner.nextInt() > PASSENGERCARCHOICE && scanner.nextInt() <= MINIVANCARCHOICE) {
            System.out.println("Choose a car");
            for (Minivan minivanCar : taxiCompany.getMinivanList()) {
                System.out.println(minivanCar);
            }
        } else {
            System.out.println("You need multiple cars.");
        }
    }

    public void getTruckCarChoice() {

        System.out.println("What is the mass of the transported cargo kg.");
        if (scanner.nextInt() <= TRUCKLOADCAPACITY) {
            System.out.println("Choose a truck");
            for (Truck truckCar : taxiCompany.getTruckList()) {
                System.out.println(truckCar);
            }
        } else {
            System.out.println("You need several trucks");
        }
    }
}
