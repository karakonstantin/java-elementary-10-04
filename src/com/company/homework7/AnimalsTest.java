package com.company.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalsTest {
    public static int age = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Input animal type (Cat, Dog, Duck, Tiger) or 'stop' to exit:");
            String AnimalsTypes = reader.readLine();

            if (AnimalsTypes.equals(" ")) {
                break;
            }
            switch (AnimalsTypes.toLowerCase().trim()) {
                case "cat":
                    Cat cat = new Cat();
                    cat.getAge();
                    cat.climb();
                    cat.run();
                    break;
                case "dog":
                    Dog dog = new Dog();
                    dog.getAge();
                    dog.climb();
                    dog.run();
                    break;
                case "duck":
                    Duck duck = new Duck();
                    duck.getAge();
                    duck.climb();
                    duck.run();
                    duck.fly();
                    break;
                case "tiger":
                    Tiger tiger = new Tiger();
                    tiger.getAge();
                    tiger.climb();
                    tiger.run();
                    break;
                default:
                    System.out.println("I have no idea what animal it is !!! ");


            }


        }

    }

}
