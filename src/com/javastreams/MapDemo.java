package com.javastreams;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        //firt list

        List<String> vehicle = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        System.out.println(vehicle);
        List<String> vehicletwo = new ArrayList<>();
        vehicletwo = vehicle.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println( vehicletwo);
        System.out.println();

        // printing the length

        vehicle.stream().map(n -> n.length()).forEach(n -> System.out.print(n + " "));
        System.out.println();

        //second list
        List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 9, 16, 3);
        List<Integer> numberstwo = new ArrayList<>();
        numberstwo = numbers.stream().map(n-> n*2).collect(Collectors.toList());
        System.out.println(numberstwo);

    }
}
