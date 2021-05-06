package com.company.homework;

public class Cat {
    String name;
    int age;
    int weight;

    void printinfo() {
        System.out.println("--------------------------");
        System.out.println("Cat name is " + this.name);
        System.out.println("Cat age is " + this.age);
        System.out.println("Cat weight is " + this.weight);

    }

    public boolean equals(Object object) {
        if (object instanceof Cat) {
            Cat cat = (Cat) object;
            return this.age == cat.age;
        }
        return false;
    }
    public String toString() {
        return "Cat" + this.name + " age, " + this.age;

    }



}
