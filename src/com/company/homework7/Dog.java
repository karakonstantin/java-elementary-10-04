package com.company.homework7;

public  class Dog extends Animal implements Climb, Run {
    @Override
    public void getAge() {
        super.getAge();
    }

    @Override
    public void climb() {
        System.out.println("Climb Dog CLimb !!! ");
    }

    @Override
    public void run() {
        System.out.println("Run Dog Run !!! ");
    }
}
