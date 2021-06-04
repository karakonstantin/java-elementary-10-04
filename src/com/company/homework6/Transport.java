package com.company.homework6;

public class Transport {
    String name;
    int swiftness;


    public Transport(String name, int swiftness) {
        this.name = name;
        this.swiftness= swiftness;
    }

    public void TransportWrite(){
        System.out.println("transport" + name + "has " + swiftness + " km/ph");
    }

}
