package com.company.homework7;

public  class Duck extends Animal implements Run, Climb, Fly {
    @Override
    public void getAge() {
        super.getAge();
    }

    @Override
    public void climb() {
        System.out.println("Climb Ducky Climb !!!");
    }

    @Override
    public void run() {
        System.out.println("Run Ducky Run !!! ");
    }

    @Override
    public void fly() {
        System.out.println("FLy Ducky Fly !!! ");
    }
}
