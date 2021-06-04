package com.company.lesson6;

public class Rat extends Animal{
    public Rat(String name) {
        super(name);
        System.out.println("Rat constr");
    }

    @Override
    public void eat(String food) {
        washPaws();
        super.eat(food);
    }

    private void washPaws() {
        System.out.println("Rat " + name + " washes paws");
    }

    @Override
    public void speak() {
        System.out.println("Rat " + name + " says pi pi pi");
    }

}
