package com.company.lesson2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int N = scanner.nextInt();
        int feb = 1;
        for (int i = 1; i <= N; i++) {
            int temp = feb * i;
            feb = temp;
        }
        System.out.println(feb);

    }
}
