package com.JavaStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class javaSteam {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,9,5,2,3,7,6);
        //Stream<Integer> data = numbers.stream();
        //Stream<Integer>  mappedData = data.map(n ->n*2);
        //mappedData.forEach(n -> System.out.println(n));

        //another  method
        numbers.stream().filter(n-> n%2==1).sorted().map(n ->n*2).forEach(n -> System.out.println(n));

    }
}