package com.company.homework17;

public class MyStringArrayListTest {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        MyStringArrayList myStringArrayList = new MyStringArrayList();
        myStringArrayList.addArray("Toys", 1);
        myStringArrayList.addArray("Tools", 2);
        myStringArrayList.addArray("Guns", 3);
        System.out.println("my StringArrayList is " + myStringArrayList);

        System.out.println("get array index" + myStringArrayList.getString(1));

        myStringArrayList.removeArray(1);
        System.out.println("remove thing " + myStringArrayList);

        myStringArrayList.setString("Sticks", 3);
        System.out.println("set thing" + myStringArrayList.toString());

        myStringArrayList.addArray("phones", 2);
        System.out.println("add thing is " + myStringArrayList.toString());

        System.out.println("toString array - " + myStringArrayList.toString());


    }
}
