package com.company.different;

public class MaxMinMassive {
    public static void main(String[] args) {
        int a = 10;
        double[] array = new double[a];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.random();

        }
        double max = array[0];
        double min = array[0];
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            average += array[i] / array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + average);
    }


}
