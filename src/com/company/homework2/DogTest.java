package com.company.homework2;

public class DogTest {
    public static void main(String[] args) {
        Dog Bambul = new Dog();
        Bambul.weight = 20;
        Bambul.power = 100;
        Bambul.name = "Bambul";

        Dog Barbos = new Dog();
        Barbos.weight = 19;
        Barbos.power = 95;
        Barbos.name = "Barbos";

        Bambul.fight(Barbos);


    }
}
