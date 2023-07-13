package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListImplement {

    public static void main(String[] args) {
        ArrayList<Integer> listone = new ArrayList<>();
        listone.add(16);
        listone.add(14);
        listone.add(13);
        listone.add(11);
        listone.add(1,7);
        listone.set(1,17);
        listone.remove(3);
        System.out.println(listone);
        //System.out.println(listone.get(0));
        System.out.println("size of list is" + " " + listone.size());
        //loops
        for (int i = 0; i < listone.size() ; i++) {
            System.out.println(listone.get(i));
        }
        //sort
        Collections.sort(listone);
        System.out.println(listone);
    }
}