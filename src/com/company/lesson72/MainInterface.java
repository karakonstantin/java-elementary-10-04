package com.company.lesson72;

import java.util.List;

public class MainInterface {
    public static void main(String[] args) {
        Drawable something = new Triangle(3, 3, 3);
        Drawable anotherThing = new Square(10);
        Drawable flower = new Flower();

        List<Drawable> elements = List.of(something, anotherThing, flower);
        drawAll(elements);
    }

    public static void drawAll(List<Drawable> drawables) {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }

    }
}
