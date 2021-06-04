package com.company.lesson72;

public class Triangle extends Shape implements Erasable {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void draw() {
        System.out.println("Draw A Triangle");

    }

    @Override
    public double CalculatePerimeter() {
        return side1 + side2 + side3;
    }

    public void erase() {
        System.out.println("ERASE TRIANGLE");

    }
}
