package com.company.homework;

import com.company.lesson3.Dog;

public class ReferenceEqualTestCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
        
    }
}
