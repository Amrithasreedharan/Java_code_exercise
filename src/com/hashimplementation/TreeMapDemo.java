package com.hashimplementation;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(10,"amritha");
        treeMap.put(2,"amritha");
        treeMap.put(12,"amritha");
        System.out.println(treeMap);

        // Getting values from the tree map
        System.out.println("value of a is  : " + treeMap.get(10));

        // Removing elements from the tree map
        treeMap.remove(2);
        System.out.println(treeMap);

        // Iterating over the elements of the tree map
        for(Integer key : treeMap.keySet()){
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
        //FOR CLEARING entire treemap
        //treeMap.clear();
        //System.out.println(treeMap);
    }

}