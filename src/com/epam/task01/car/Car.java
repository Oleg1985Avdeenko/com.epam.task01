package com.epam.task01.car;


import java.math.BigDecimal;
import java.util.Objects;

public class Car {

    private String name;
    private BigDecimal cost;
    private Double fuelConsuption;

    public Car(String name, BigDecimal cost, Double fuelConsuption) {
        this.name = name;
        this.cost = cost;
        this.fuelConsuption = fuelConsuption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Double getFuelConsuption() {
        return fuelConsuption;
    }

    public void setFuelConsuption(Double fuelConsuption) {
        this.fuelConsuption = fuelConsuption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(cost, car.cost) && Objects.equals(fuelConsuption, car.fuelConsuption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, fuelConsuption);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", fuelConsuption=" + fuelConsuption +
                '}';
    }
}

