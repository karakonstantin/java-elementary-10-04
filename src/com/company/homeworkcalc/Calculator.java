package com.company.homeworkcalc;

public class Calculator {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0].toString());
        String sym = args[1];
        int number1 = Integer.parseInt(args[2]);

        if (sym.equals("+")) {
            System.out.println(number + sym + number1 + "=" + (number + number1));
        }
        if (sym.equals("-")) {
            System.out.println(number + sym + number1 + "=" + (number - number1));
        }
        if (sym.equals("*")) {
            System.out.println(number + sym + number1 + "=" + (number * number1));
        }
        if (sym.equals("/")) {
            System.out.println(number + sym + number1 + "=" + (number / number1));
        }
    }
}
