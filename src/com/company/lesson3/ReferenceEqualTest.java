package com.company.lesson3;

public class ReferenceEqualTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

       // String test1 = "test1";
        //String test2 = "test2";
    }
}
