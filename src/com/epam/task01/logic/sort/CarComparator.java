package com.epam.task01.logic.sort;

import com.epam.task01.car.Car;

public class CarComparator implements java.util.Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getFuelConsuption().compareTo(car2.getFuelConsuption());
    }
}
