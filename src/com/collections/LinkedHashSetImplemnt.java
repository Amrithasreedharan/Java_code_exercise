package com.collections;

import java.util.HashSet;

public class LinkedHashSetImplemnt {
    public static void main(String[] args) {
        HashSet linkHashSet = new HashSet<>();
        linkHashSet.add("a");
        linkHashSet.add(1);
        linkHashSet.add(5);
        linkHashSet.add("A");
        linkHashSet.add(null);
        System.out.println(linkHashSet);
    }
}
