package com.epam.task01.logic;

/**
 * This class creates lists of cars in a taxi company.
 * Accepts the parameters of each car.
 * Interacts with the Passenger, Minivan, Truck, Car classes.
 * @see com.epam.task01.car.Car
 * @see com.epam.task01.car.Passenger
 * @see com.epam.task01.car.Minivan
 * @see com.epam.task01.car.Truck
 */

import com.epam.task01.car.Minivan;
import com.epam.task01.car.Passenger;
import com.epam.task01.car.Truck;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxiCompany {


    Passenger passenger1 = new Passenger("Ford Focus",
            new BigDecimal("7235.33"),
            7.7,
            "comfort",
            350);
    Passenger passenger2 = new Passenger("KIA Rio",
            new BigDecimal("8524.75"),
            6.5,
            "econom",
            250);
    Passenger passenger3 = new Passenger("Wolksvagen Polo",
            new BigDecimal("11352.23"),
            7.5,
            "econom",
            300);
    Passenger passenger4 = new Passenger("BMW E50",
            new BigDecimal("17274.32"),
            8.2,
            "prestige",
            400);
    Passenger passenger5 = new Passenger("Mercedes-Benz W177",
            new BigDecimal("46576.32"),
            9.8,
            "premium",
            450);

    private List<Passenger> passengerList;

    Minivan minivan1 = new Minivan("Fiat Jump",
            new BigDecimal("12320.25"),
            7.7,
            "cargo-passenger",
            6);
    Minivan minivan2 = new Minivan("Ford Galaxy",
            new BigDecimal("13436.28"),
            8.5,
            "passenger",
            6);
    Minivan minivan3 = new Minivan("Wolksvagen Sharan",
            new BigDecimal("13202.69"),
            9.2,
            "passenger",
            7);
    Minivan minivan4 = new Minivan("Mercedes-Benz Vito",
            new BigDecimal("17615.85"),
            9.3,
            "cargo-passenger",
            7);
    Minivan minivan5 = new Minivan("Fiat Ulise",
            new BigDecimal("13709.87"),
            7.2,
            "passenger",
            6);

    private List<Minivan> minivanList;

    Truck truck1 = new Truck("Iveco Daily",
            new BigDecimal("18087.48"),
            8.5,
            "avning",
            4500);
    Truck truck2 = new Truck("Fiat Ducato",
            new BigDecimal("14202.36"),
            8.5,
            "van",
            4500);
    Truck truck3 = new Truck("Ford Transit",
            new BigDecimal("9879.85"),
            8.0,
            "van",
            3300);
    Truck truck4 = new Truck("Mercedes-Benz Sprinter",
            new BigDecimal("17248.23"),
            9.2,
            "flatbed",
            5000);

    private List<Truck> truckList;

    public TaxiCompany() {
        passengerList = new ArrayList<>(Arrays.asList(passenger1,
                passenger2,
                passenger3,
                passenger4,
                passenger5));
        minivanList = new ArrayList<>(Arrays.asList(minivan1,
                minivan2,
                minivan3,
                minivan4,
                minivan5));
        truckList = new ArrayList<>(Arrays.asList(truck1,
                truck2,
                truck3,
                truck4));
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public List<Minivan> getMinivanList() {
        return minivanList;
    }

    public void setMinivanList(List<Minivan> minivanList) {
        this.minivanList = minivanList;
    }

    public List<Truck> getTruckList() {
        return truckList;
    }

    public void setTruckList(List<Truck> truckList) {
        this.truckList = truckList;
    }
}