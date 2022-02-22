package com.epam.task01.main;

/**
 * This class displays a custom menu for selecting the desired action.
 * Based on the received parameters, it calls the necessary method from the Program, Sort, and FlleetCost classes.
 *
 * @see com.epam.task01.logic.program.Program#getPassengerCarChoice()
 * @see com.epam.task01.logic.program.Program#getTruckCarChoice()
 * @see com.epam.task01.logic.sort.Sorter#sort()
 * @see com.epam.task01.logic.program.FleetCost#getFleetCost()
 */

import com.epam.task01.logic.program.FleetCost;
import com.epam.task01.logic.program.Program;
import com.epam.task01.logic.sort.Sorter;

import java.util.Scanner;

public class Main {
    private static final int PASSENGERLIST = 1;
    private static final int TRUCKLIST = 2;
    private static final int FUELCONSUPTION = 3;
    private static final int FLEETCOST = 4;

    public static void main(String[] args) {
        System.out.println("If you need passenger Car, press 1" +
                " \nIf you need truck, press 2" +
                "\nIf you need sorting by fuel consumption, press 3 \n" +
                "If you want to know the cost of a car park, press 4");

        Scanner scanner = new Scanner(System.in);
        Program program = new Program();

        switch (scanner.nextInt()) {
            case PASSENGERLIST:
                program.getPassengerCarChoice();
                break;
            case TRUCKLIST:
                program.getTruckCarChoice();
                break;
            case FUELCONSUPTION:
                Sorter sort1 = new Sorter();
                sort1.sort();
                break;
            case FLEETCOST:
                FleetCost fleetCost = new FleetCost();
                System.out.println("Fleet Cost = " + fleetCost.getFleetCost());
                break;
            default:
                System.out.println("Wrong input");
                break;
        }

    }
}
