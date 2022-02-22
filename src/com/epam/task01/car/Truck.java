package com.epam.task01.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Truck extends Car {

    private String bodyType;
    private int loadCapacity;

    public Truck(String name, BigDecimal cost, Double fuelConsuption, String bodyType, int loadCapacity) {
        super(name, cost, fuelConsuption);
        this.bodyType = bodyType;
        this.loadCapacity = loadCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity && Objects.equals(bodyType, truck.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType, loadCapacity);
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "bodyType='" + bodyType + '\'' +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
