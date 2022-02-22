package com.epam.task01.logic.sort;

/**
 * This class gets the lists of taxi cars from the TaxiCompany class and sorts all the cars by fuel consumption.
 * Interacts with the CarComparator class.
 * The request receives from the Main class.
 *
 * @see com.epam.task01.logic.TaxiCompany
 * @see com.epam.task01.logic.sort.CarComparator
 * @see com.epam.task01.main.Main
 */

import com.epam.task01.car.Car;
import com.epam.task01.logic.TaxiCompany;

import java.util.ArrayList;
import java.util.List;

public class Sorter {

    public void sort() {

        TaxiCompany taxiCompany = new TaxiCompany();
        List<Car> cars = new ArrayList<>();

        cars.addAll(taxiCompany.getPassengerList());
        cars.addAll(taxiCompany.getMinivanList());
        cars.addAll(taxiCompany.getTruckList());

        CarComparator comparator = new CarComparator();
        cars.sort(comparator);

        for (Car car : cars) {
            System.out.println(car);
        }
    }

}
