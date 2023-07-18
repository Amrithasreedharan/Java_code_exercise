package com.javastreams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(50);
        arrayList.add(7);
        arrayList.add(12);
        arrayList.add(11);
        arrayList.add(2);
        arrayList.add(1);
        System.out.println(arrayList);
        List<Integer> arrayListTwo   = new ArrayList<>();

        // steams
        /*After filtering its storing to another collections.
        arrayListTwo = arrayList.stream().filter(n-> n%2 ==0).collect(Collectors.toList());
        System.out.println(arrayListTwo);*/

        // here after filtering not storing to another collection
        arrayList.stream().filter(n-> n%2 ==0).forEach(n-> System.out.print(n + " "));

    }
}
