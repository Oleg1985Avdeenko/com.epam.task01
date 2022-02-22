package com.epam.task01.logic.program;

/**
 * This class gets the lists of fleet vehicles from the TaxiCompany class
 * Calculates the cost of the entire fleet.
 * Return fleet cost.
 * Requests come from the Main class.
 * @see com.epam.task01.logic.TaxiCompany
 * @see com.epam.task01.main.Main
 */

import com.epam.task01.car.Minivan;
import com.epam.task01.car.Passenger;
import com.epam.task01.car.Truck;
import com.epam.task01.logic.TaxiCompany;

import java.math.BigDecimal;

public class FleetCost {

    private BigDecimal fleetCost;
    private BigDecimal passengerCost;
    private BigDecimal minivanCost;
    private BigDecimal truckCost;

    TaxiCompany taxiCompany = new TaxiCompany();


    public BigDecimal getFleetCost() {
        fleetCost = BigDecimal.ZERO;
        passengerCost = BigDecimal.ZERO;
        minivanCost = BigDecimal.ZERO;
        truckCost = BigDecimal.ZERO;

        for (Passenger passengerCar : taxiCompany.getPassengerList()) {
            passengerCost = passengerCost.add(passengerCar.getCost());
        }

        for (Minivan minivanCar : taxiCompany.getMinivanList()) {
            minivanCost = minivanCost.add(minivanCar.getCost());
        }

        for (Truck truckCar : taxiCompany.getTruckList()) {
            truckCost = truckCost.add(truckCar.getCost());
        }
        return fleetCost = passengerCost.add(minivanCost.add(truckCost));
    }
}
