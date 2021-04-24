package com.company.lesson3;

public class PrimitieTypeTest {
    public static void main(String[] args) {
        int number1 = 1;
        System.out.println("before method call " + number1);
        changeNumber(number1, 100);
        System.out.println("after metod call " + number1);
        System.out.println("-------------------------------");

        int number2 = 2;
        System.out.println("before method call " + number2);
        changeNumber(number2, 200);
        System.out.println("after metod call " + number2);
        System.out.println("-------------------------------");


        int number3 = 3;
        System.out.println("before method call " + number3);
        changeNumber(number3, 300);
        System.out.println("after metod call " + number3);
        System.out.println("in the end " + number1);
        System.out.println("-------------------------------");

    }
    static void changeNumber(int number, int newValue){
        System.out.println("in method changeNumber before change " + number);
        number = newValue;
        System.out.println("in method changeNumber after change " + number);

    }
}
