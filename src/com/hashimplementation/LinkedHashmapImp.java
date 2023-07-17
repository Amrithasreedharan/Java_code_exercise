package com.hashimplementation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashmapImp {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"amritha");
        map.put(2,"amritha sreedharan");
        map.put(3,"amritha Thayambath");
        System.out.println(map);
        System.out.println(map.get(1));
        for(Map.Entry<Integer, String> entry:map.entrySet()){
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }



    }
}

