package com.stringmethods;

public class StringMethod {
    public static void main(String[] args) {
        String string = "Welcome!!!";
        String stringone = " Hey AMRITHA ,";

        System.out.println(string.length());
        System.out.println(stringone.concat(string )); //concatinate
        System.out.println(stringone.trim());          //trim space at start
        System.out.println(stringone.charAt(5));
        System.out.println(string.contains("comee"));
        System.out.println(string.equals("Welcome!!!"));
        System.out.println(stringone.replace("MRITHA","mritha"));
        System.out.println(stringone.substring(5,12));
        System.out.println(string.toUpperCase());
        System.out.println(stringone.toLowerCase());

    }
}
