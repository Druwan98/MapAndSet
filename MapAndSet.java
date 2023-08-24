package Lessons.Exercise._MapAndSet;

import java.util.HashMap;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapAndSet {
    public static void main(String[] args){
//        HashMap<String,Integer> months = new HashMap<String,Integer>();
        HashMap<String, Integer> months = new LinkedHashMap<>();
        months.put("Gennaio",1);
        months.put("Febbraio",2);
        months.put("Marzo",3);
        months.put("Aprile",4);
        months.put("Maggio",5);
        months.put("Giugno",6);
        months.put("Luglio",7);
        months.put("Agosto",8);
        months.put("Settembre",9);
        months.put("Ottobre",10);
        months.put("Novembre",11);
        months.put("Dicembre",12);

        Set<String> keys = months.keySet();
        System.out.println(keys);

        HashSet<Integer> cardinalMonth = new HashSet<>(months.values()); // HashMap a HashSet
        System.out.println(cardinalMonth);

        Integer[] cardinalMonthArray = months.values().toArray(new Integer[0]);
        for (int i = 0; i < cardinalMonthArray.length ; i++) {
        System.out.println(cardinalMonthArray[i]);
        }








    }
}
