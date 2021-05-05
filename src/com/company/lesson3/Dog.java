package com.company.lesson3;

public class Dog {
    String name;
    String breed;
    float length;
    int age;
    String color;

    void eat() {
        System.out.println(" dog eats");

    }

    void sleep() {
        System.out.println(" dog sleeps");
    }

    Stick giveStick() {
        Stick stick = new Stick();
        stick.name = "my lovely stick";
        stick.length = 10;
        return stick;

    }

    void printinfo() {
        System.out.println("--------------------------");
        System.out.println("Dog name is " + this.name);
        System.out.println("Dog age is " + this.age);
        System.out.println("Dog color is " + this.color);
        System.out.println("Dog length is " + this.length);
        System.out.println("Dog breed is " + this.breed);

    }

    public boolean equals(Object object) {
        if (object instanceof Dog) {
            Dog dog = (Dog) object;
            return this.age == dog.age;
        }
        return false;
    }

    public String toString() {
        return "Dog" + this.name + " age, " + this.age;

    }


}
