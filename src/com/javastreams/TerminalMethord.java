package com.javastreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TerminalMethord {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 9, 16, 3);
        // sorted
        numbers.stream().sorted().forEach(n-> System.out.print(n + " "));
         // reverse order
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(n-> System.out.print(n + " "));
        System.out.println();
        //string
        List<String> names = Arrays.asList("amritha","thayambath","hai","hello","hihihih");
        names.stream().sorted().forEach(n-> System.out.print(n + " "));

    }
}
