package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetImplementation {
    public static void main(String[] args) {

        HashSet<Integer> setone = new HashSet<>();

        //insert

        setone.add(1);
        setone.add(7);
        setone.add(6);
        setone.add(66);
        setone.add(16);

        // search contain

        if(setone.contains(1)){
            System.out.println("ya it contains");
        }else {
            System.out.println("not contains");
        }
        //delete
        setone.remove(1);
        if(setone.contains(1)){
            System.out.println("ya it contains");
        }else {
            System.out.println("not contains");
        }
        // size
        System.out.println("size is" + " " +setone.size());

        // printing element
        System.out.println(setone);

        //iterator
        Iterator iterator = setone.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + ",");
        }

    }

    }
