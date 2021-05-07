package com.company.homeworkabc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summa {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (true) {
            String st = reader.readLine();
            if (" STOP ".equals(st)) {
                System.out.println(n);
                break;
            } else {
                n += Integer.parseInt(st);
            }
        }
    }
}
