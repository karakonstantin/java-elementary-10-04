package com.company.homework6;

public class SportCar extends Transport {
    int passengers;
    int fuelReserve;
    int suitcase;

    public SportCar(String name, int swiftness) {
        super(name, swiftness);
        passengers = 5;
        fuelReserve = 100;
        suitcase = 10;
    }

    public void SportCarForCoolGuys() {
        System.out.println("This sport can carry"
                + passengers + " passengers " + " and "
                + suitcase + " suitcases " + " with capacity of "
                + fuelReserve + " litres");
    }
}
