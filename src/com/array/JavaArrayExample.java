package com.array;
import java.util.*;
public class JavaArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n = ");
        int n= scanner.nextInt();
        int sum = (n*(n+1))/2 ;
        int marks[] = new int[n];
        int sum1 =0;
        for (int i = 0; i <marks.length ; i++) {
            marks[i] =scanner.nextInt();
            sum1= sum1 + marks[i];
        }
        int diff = sum - sum1;


        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        //System.out.println("sum is " + sum);
        System.out.println(diff);
    }
}
