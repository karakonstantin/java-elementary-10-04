package com.company.homework20another;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DeleteSummerPeople {
    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);

        for(Map.Entry<String, Date> pair : map.entrySet())
        {
            System.out.println(pair.getValue());
        }
    }

    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));


        map.put("Дима", new Date("JUNE 28 1984"));
        map.put("Вадим", new Date("APR 29 1992"));
        map.put("Мама", new Date("DEC 11 1959"));
        map.put("Сталлоне1", new Date("JUNE 9 1980"));
        map.put("Сталлоне2", new Date("JUNE 5 1980"));
        map.put("Сталлоне3", new Date("JUNE 28 1980"));
        map.put("Сталлоне4", new Date("JUNE 2 1980"));
        map.put("Сталлоне5", new Date("JUNE 4 1980"));
        map.put("Сталлоне6", new Date("JUNE 6 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if (rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }
    }
}
