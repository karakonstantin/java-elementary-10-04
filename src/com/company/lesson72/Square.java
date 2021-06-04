package com.company.lesson72;

public class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("DRAW SQUARE");

    }

    @Override
    public double CalculatePerimeter() {
        return side = 4;
    }
}
