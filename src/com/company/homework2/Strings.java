package com.company.homework2;


import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String[] array = new String[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scaner.nextLine();
        }
        int lengthStrMax = array[0].length();
        int lengthStrMin = array[0].length();
        String max = "";
        String min = "";
        for (int i = 0; i <= (array.length - 1); i++) {
            if (array[i].length() > lengthStrMax) {
                lengthStrMax = array[i].length();
                max = array[i];
            }
            if (array[i].length() <= lengthStrMin) {
                lengthStrMin = array[i].length();
                min = array[i];
            }
        }
        System.out.println("maxline = " + max + "; length=" + max.length());
        System.out.println("minline = " + min + "; length=" + min.length());
    }
}
