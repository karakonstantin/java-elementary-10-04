package com.company.homework8;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangleNumber1 = new Rectangle(5, 5, 5);
        System.out.println(rectangleNumber1);

        Rectangle rectangleNumber2 = new Rectangle(5, 5, 5, 5);
        System.out.println(rectangleNumber2);

        Rectangle rectangleNumber3 = new Rectangle(12, 26);
        System.out.println(rectangleNumber3);

        Rectangle rectangleNumber4 = new Rectangle(rectangleNumber2);
        System.out.println(rectangleNumber4);
    }
}
