package MyHashMap;

import MyHashMap.MyHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap();

        myHashMap.put("asd1", 0);
        myHashMap.put("asd1", 1);
        myHashMap.put("asd2", 2);
        myHashMap.put("asd3", 3);
        myHashMap.put("asd4", 4);
        myHashMap.put("asd5", 5);
        myHashMap.put("asd6", 6);
        myHashMap.put("asd7", 7);
        myHashMap.put("asd8", 8);
        myHashMap.put("asd9", 9);
        myHashMap.put("asd10", 10);

        System.out.println("myHashMAp.get(\"asd9\") = " + myHashMap.get("asd9"));
        myHashMap.remove("asd6");

        System.out.println("size =" + myHashMap.size());

        Map<String, Integer> map  = new HashMap();
//        map.clear();
    }
}
