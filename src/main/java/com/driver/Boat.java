package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;
    @Override
    public String getVehicleName() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}