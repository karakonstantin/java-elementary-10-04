package com.company.homework6;

public class Plane extends Transport {
    int passengers;
    int fuelReserve;

    public Plane(String name, int swiftness) {
        super(name, swiftness);
        passengers = 10000;
        fuelReserve = 1000000;

    }

    public void PlaneForPassengers() {
        System.out.println("This plane can carry"
                + passengers + " passengers " + "with capacity of "
                + fuelReserve + " litres");
        System.out.println("==================================================");
    }

}
