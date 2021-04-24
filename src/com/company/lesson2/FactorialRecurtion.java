package com.company.lesson2;

public class FactorialRecurtion {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);

    }

    public static int factorial(int abc) {
        if (abc == 1) {
            return 1;
        }
        return abc * factorial(abc - 1);
    }
}
