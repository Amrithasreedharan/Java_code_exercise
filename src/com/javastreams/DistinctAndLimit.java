package com.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DistinctAndLimit {
    public static void main(String[] args) {
        List<String> vehicle = Arrays.asList("bus", "car", "bicycle", "flight", "train", "bus", "train", "abmasidor car");
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 3, 0, 2, 4, 7, 554);
        List<String> beforelist = Arrays.asList("am", "rith", "a thayambath");
        vehicle.stream().distinct().forEach(n -> System.out.println(n));

        //count
        long count = vehicle.stream().count();
        System.out.println(count);
        //limit
        vehicle.stream().limit(3).forEach(n -> System.out.print(n + " "));
        System.out.println();

        //min
        Optional<Integer> min = numbers.stream().min((a, b) -> {
            return a.compareTo(b);
        });
        System.out.println("min element is :" + min.get());
        System.out.println();

        // max
        Optional<Integer> max = numbers.stream().max((a, b) -> {
            return a.compareTo(b);
        });
        System.out.println("max element is :" + max.get());
        System.out.println();

        //reduce
        Optional<String> reduced = beforelist.stream().reduce((value, combined) -> {
            return combined + value;
        });
        System.out.println(beforelist);
        System.out.println(reduced.get());
    }

}
