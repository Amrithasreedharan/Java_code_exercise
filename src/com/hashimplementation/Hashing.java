package com.hashimplementation;
import java.util.HashMap;
import java.util.Map;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        //Insertion
        map.put("amritha",100);
        map.put("amru",10);
        map.put("ammu",180);
        map.put("amr",170);
        map.put("ritha",60);
        System.out.println(map);
        map.put("amritha",190);
        System.out.println(map);

        //search
        if(map.containsKey("amritha")){
            System.out.println("present");
        }else{
            System.out.println("key is not present");
        }
        // getting the value
        System.out.println(map.get("amru"));
        System.out.println(map.get("riha"));

        //Iteration
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.print(entry + " ,");
        }
        map.remove("ammu");
        System.out.println(map);
    }
}
