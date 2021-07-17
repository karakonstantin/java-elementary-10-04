package com.company.homework18;
//#2
import java.util.ArrayList;

public class ProductsList {
    ArrayList<Products> strings = new ArrayList<>();

    public void add(Products products) {
        strings.add(products);
    }

    public void nameProduct(int index) {
        System.out.println(strings.get(index).getName());
    }

    public void removeProduct(String nameProduct) {
        String str = "";
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).getName().equals(nameProduct)) {
                strings.remove(i);
                str = "product deleted";
            }
        }
        if (str.length() > 0) {
            System.out.println(str);
        } else {
            System.out.println("product not found");
        }
    }
}
