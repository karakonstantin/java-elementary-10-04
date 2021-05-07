package com.company.homework2;

public class CatExperiment2 {
    String name;
    int age;
    int weight;
    int strength;

    public static void main(String[] args) {

        CatExperiment2 tom = new CatExperiment2();
        tom.name = "Tom";
        tom.weight = 25;
        tom.strength = 15;
        tom.age = 3;

        CatExperiment2 fil = new CatExperiment2();
        fil.name = "Fil";
        fil.age = 1;
        fil.strength = 20;
        fil.weight = 20;

        fil.fight(tom);
        if (fil.fight(tom))
            System.out.print("Tom - proigral");
        else
            System.out.print("Fil - proigral");
    }

    public CatExperiment2() {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(CatExperiment2 anotherCat) {
        if (this.strength > anotherCat.strength) {
            return true;
        } else return false;
    }
}
