package com.collections;

import java.util.LinkedList;

public class LinkListCollec {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("a");
        list.addFirst("good");
        list.addFirst("day");
        list.addLast("hai amru");
        list.add("hihihi");
        System.out.println(list);
        list.removeFirst();
        list.removeFirstOccurrence("a");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");
        }
        System.out.println("null");
    }
}
