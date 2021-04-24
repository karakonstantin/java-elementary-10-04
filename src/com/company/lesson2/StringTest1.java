package com.company.lesson2;

public class StringTest1 {
    public static void main(String[] args) {
        String string = "test";
        System.out.println(string);
        String string3 = "test";

        string = string + " some new text";
        System.out.println(string);

        String string2 = new String("test2");
        String newString = string + string2;
        int number = 2;
        StringBuffer stringBuffer = new StringBuffer("hillel");
        stringBuffer.append(".com")
                .append(".com")
                .append(".com")
                .append(".com")
                .append(".com");

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuffer.toString());

    }
}
