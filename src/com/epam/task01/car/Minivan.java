package com.epam.task01.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Minivan extends Car{

    private String type;
    private int numberOfSeats;


    public Minivan(String name, BigDecimal cost, Double fuelConsuption, String type, int numberOfSeats) {
        super(name, cost, fuelConsuption);
        this.type = type;
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Minivan minivan = (Minivan) o;
        return numberOfSeats == minivan.numberOfSeats && Objects.equals(type, minivan.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, numberOfSeats);
    }

    @Override
    public String toString() {
        return super.toString() + "Minivan{" +
                "type='" + type + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
