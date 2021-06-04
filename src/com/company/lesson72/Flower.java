package com.company.lesson72;

public class Flower implements Drawable, Smellable {
    @Override
    public void draw() {
        System.out.println("DRAW FLOWER");

    }

    @Override
    public void smell() {
        System.out.println("SMELL FLOWER");

    }
}
