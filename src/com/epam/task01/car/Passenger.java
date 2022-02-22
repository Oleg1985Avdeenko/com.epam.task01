package com.epam.task01.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Passenger extends Car {

    private String rate;
    private int travelDistance;

    public Passenger(String name, BigDecimal cost, Double fuelConsuption, String rate, int travelDistance) {
        super(name, cost, fuelConsuption);
        this.rate = rate;
        this.travelDistance = travelDistance;
    }

    public int getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(int travelDistance) {
        this.travelDistance = travelDistance;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Passenger passenger = (Passenger) o;
        return travelDistance == passenger.travelDistance && Objects.equals(rate, passenger.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rate, travelDistance);
    }

    @Override
    public String toString() {
        return super.toString() + "Passenger{" +
                "travelDistance=" + travelDistance +
                ", rate=" + rate +
                '}';
    }
}
