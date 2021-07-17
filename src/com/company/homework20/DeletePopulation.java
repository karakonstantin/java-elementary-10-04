package com.company.homework20;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;

public class DeletePopulation {
    public static HashMap<String, LocalDate> createMap() {
        HashMap<String, LocalDate> dateHashMap = new HashMap<>();

        dateHashMap.put("Rodion", LocalDate.of(2004, 5, 1));
        dateHashMap.put("Stalin", LocalDate.of(1878, 12, 18));
        dateHashMap.put("Hitler", LocalDate.of(1889, 4, 20));
        dateHashMap.put("Churchill", LocalDate.of(1874, 11, 30));
        dateHashMap.put("Petrov", LocalDate.of(1968, 7, 27));
        dateHashMap.put("Klemov", LocalDate.of(1550, 6, 6));
        dateHashMap.put("Lodigyn", LocalDate.of(2330, 6, 31));
        dateHashMap.put("Arsentiev", LocalDate.of(5230, 8, 4));
        dateHashMap.put("Burzhui", LocalDate.of(1202, 12, 19));
        dateHashMap.put("Turak", LocalDate.of(1678, 9, 24));
        dateHashMap.put("Strange", LocalDate.of(1975, 10, 28));
        dateHashMap.put("Parker", LocalDate.of(1990, 2, 4));
        dateHashMap.put("Rogers", LocalDate.of(1912, 3, 5));
        dateHashMap.put("Lunin", LocalDate.of(2000, 6, 9));
        dateHashMap.put("Tarasov", LocalDate.of(998, 7, 13));


        return dateHashMap;
    }

    public static void removeAllSummerPeople(HashMap<String, LocalDate> map) {
        Iterator<HashMap.Entry<String, LocalDate>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            HashMap.Entry<String, LocalDate> it = entryIterator.next();
            LocalDate date = it.getValue();
            int month = date.getMonthValue();
            if (month < 9 && month > 5) {
                entryIterator.remove();
            }
        }
        System.out.println(map.toString());
    }

    public static void main(String[] args) {
        System.out.println(createMap());
        removeAllSummerPeople(createMap());
    }
}
