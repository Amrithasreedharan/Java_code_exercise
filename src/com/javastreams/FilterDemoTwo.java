package com.javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemoTwo {
    public static void main(String[] args) {
        /*List<String> names = Arrays.asList("amritha","thayambath","hai","hello","hihihih");
        List<String> name = new ArrayList<>();
        System.out.println(names);
        name = names.stream().filter(n->n.length()>6 && n.length()<8).collect(Collectors.toList());
        System.out.println(name);*/

        //take null value ,filter that out and store in other collection

        List<String> names = Arrays.asList("amritha",null,"thayambath","hai",null,"hello","hihihih");
        List<String> name = new ArrayList<>();
        System.out.println(names);
        name = names.stream().filter(n->n!=null).collect(Collectors.toList());
        System.out.println(name);
    }
}
