package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super();
        this.wheels = wheels;
        this.isManual = isManual;
        this.doors = doors;
        this.gears = gears;
        this.type = type;
        this.seats = seats;
        this.type = type;
        //Hint: Car extends Vehicle


    }

    public Car(String name, boolean isManual) {
        super();
        this.isManual = isManual;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public int getcurrentDirection() {
        return super.getCurrentDirection();
    }
}
