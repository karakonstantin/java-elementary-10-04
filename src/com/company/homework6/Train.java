package com.company.homework6;

public class Train extends Transport {
    int inhabitants;
    int animals;
    int furnitureDepartments;

    public Train(String name, int swiftness) {
        super(name, swiftness);
        inhabitants = 569;
        animals = 45;
        furnitureDepartments = 3;
    }

    public void TrainForUsualPeople() {
        System.out.println("This train is capable of carrying "
                + inhabitants + " inhabitants, "
                + animals + " animals" + " and "
                + furnitureDepartments + " departments !!!");
        System.out.println("==================================================");
    }


}
