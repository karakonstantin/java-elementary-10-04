package com.company.homework17;

import java.util.ArrayList;

public class MyStringArrayList {
    ArrayList<String> list = new ArrayList<>();

    public String getString(int arrayIndex) {
        return list.get(arrayIndex);
    }

    public void setString(String string, int arrayIndex) {
        list.set(arrayIndex, string);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public void addArray(String string, int arrayIndex) {
        list.add(arrayIndex, string);
    }

    public void removeArray( int arrayIndex) {
        list.remove(arrayIndex);
    }
}
