package com.company.homeworkabc;

import java.util.Scanner;

public class SummaAnother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int abc = 0;

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("STOP")) {
                break;
            }
            abc += Integer.parseInt(s);

        }
        System.out.println(abc);
    }
}
