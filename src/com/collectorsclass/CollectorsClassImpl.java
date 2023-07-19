package com.collectorsclass;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsClassImpl {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,6);
        List<String> strings = Arrays.asList("alpha","beta","gamma","a","a");
        LinkedList<Integer> linkedList = integers.stream().filter(x->x>2).collect(Collectors   // method 1
                                                                    .toCollection(LinkedList::new));
        System.out.println(linkedList);
        Long collect = integers.stream()
                .filter(x -> x <4)
                .collect(Collectors.counting());                                             //method 2
        System.out.println(collect);

        int a =integers.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get(); //method 3
        System.out.println(a);

        String b = strings.stream()
                                .collect(Collectors.minBy(Comparator.naturalOrder())).get();
        System.out.println(b);

        int c =integers.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get(); //method 4
        System.out.println(c);

        String d = strings.stream()
                .collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        System.out.println(d);

        Map<Boolean, List<String>> collect1 = strings.stream().collect(Collectors           //method 5
                                                .partitioningBy(x -> x.length() > 2));
        System.out.println(collect1);

        String collect3 = strings.stream().distinct().collect(Collectors.joining(","));  //method 6
        System.out.println(collect3);

        String collect4 = strings.stream().collect(Collectors                                    //method 6.a
                                                    .joining(",","{","}"));
        System.out.println(collect4);

        //group by
        Map<Integer, List<String>> collectThree = strings.stream()
                                                    .collect(Collectors.groupingBy(String::length));
        System.out.println(" grp by" + collectThree);
    }
    }

