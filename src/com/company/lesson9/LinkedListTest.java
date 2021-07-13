package com.company.lesson9;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("test");
        strings.addFirst("first");
        strings.addLast("last");

        System.out.println(strings);

        strings.add(1, "middle");

        System.out.println(strings);

        strings.remove(2);

        System.out.println(strings);

    }
}
