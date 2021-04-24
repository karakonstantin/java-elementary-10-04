package com.company.lesson3;

public class DogTest {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.name = "Dobby";
        dobby.age = 3;
        dobby.color = "brown";
        dobby.printinfo();
        Stick stick = dobby.giveStick();
        System.out.println(dobby.name + "brought me" + stick.name + " with length " + stick.length );


        Dog botik = new Dog();
        botik.name = "Botik";
        botik.length = 45.7F;
        botik.breed = "maltese";
        botik.printinfo();






    }

}
