package com.company.homework2;

public class Dog {
    String name;
    double weight;
    int power;
    String battle;


    void fight(Dog dog) {
        if (this.power > dog.power) {
            battle = this.name;
        } else if (this.power < dog.power) {
            battle = dog.name;
        } else {
            battle = "No one wins";
        }
        System.out.println("Our winner is " + battle);
    }
}