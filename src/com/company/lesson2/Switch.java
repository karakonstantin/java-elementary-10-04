package com.company.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inPut;

        while (!(inPut = reader.readLine()).equals("exit")) {


            switch (inPut) {
                case "monday":
                    System.out.println("we do smtg");
                    break;
                case "wednesday":
                    System.out.println("we do nothing");
                    break;
                case "friday":
                    System.out.println("we do basically nothing");
                    break;
                default:
                    System.out.println("Sorry we do not know what to do this" + inPut);
            }
        }
    }


}