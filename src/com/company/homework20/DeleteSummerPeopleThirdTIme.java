package com.company.homework20;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DeleteSummerPeopleThirdTIme {
    public static void main(String[] args) {
        Map<String, LocalDate> dateMap = new HashMap<>();

        dateMap.put("Parker", LocalDate.of(1000, 2, 12));
        dateMap.put("Steve", LocalDate.of(1784, 8, 23));
        dateMap.put("Kennedy", LocalDate.of(1000, 4, 31));
        dateMap.put("Liam", LocalDate.of(1000, 6, 19));
        dateMap.put("Scott", LocalDate.of(1000, 9, 5));
        dateMap.put("Maria", LocalDate.of(1000, 10, 4));

        System.out.println();
        for (Map.Entry entry : dateMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();
        Iterator<Map.Entry<String, LocalDate>> entryIterator = dateMap.entrySet().iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, LocalDate> dateEntry = entryIterator.next();
            LocalDate localDate = dateEntry.getValue();
            int date = localDate.getMonthValue();
            if (date == 6 && date == 7 && date == 8) {
                entryIterator.remove();
            }
            for (Map.Entry entry : dateMap.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
