package com.exceptionhandling;

import java.sql.SQLOutput;

public class EceptionHandling {
    public static void main(String[] args) throws InterruptedException {

        // unckecked exception
       /* System.out.println("hai guys!!!!");
        String string = null;
        try {

            System.out.println(string.length());
        }catch(NullPointerException obj){
            System.out.println("erorr occured!!!!");
        }*/

        //checked exception
        System.out.println("program is started");
        System.out.println("program is in progress");
        Thread.sleep(5000);
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println("program is completed");
        System.out.println("program is exited");

    }
}
