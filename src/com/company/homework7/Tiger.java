package com.company.homework7;

public class Tiger extends Animal implements Climb, Run {
    @Override
    public void getAge() {
        super.getAge();
        System.out.println("Write an age");
    }

    @Override
    public void climb() {
        System.out.println("CLimb Tiger CLimb !!!");
    }

    @Override
    public void run() {
        System.out.println("Run Tiger Run !!! ");
    }
}
