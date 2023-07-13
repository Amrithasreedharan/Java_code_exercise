package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetImplemnt {
    public static void main(String[] args) {
        LinkedHashSet linkHashSet = new LinkedHashSet<>();
        linkHashSet.add("a");
        linkHashSet.add(1);
        linkHashSet.add(5);
        linkHashSet.add("A");
        linkHashSet.add(null);
        System.out.println(linkHashSet);
    }
}
