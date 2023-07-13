package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExer {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>();
        System.out.println("enter 10 elements");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (!elements.contains(a)) {
                elements.add(a);
            }
        }
        Collections.sort(elements);
        System.out.println(elements);

    }
}