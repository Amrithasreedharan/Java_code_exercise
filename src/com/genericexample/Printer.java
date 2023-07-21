package com.genericexample;

public class Printer<T> {
    T thingsToPrint;

    public Printer(T thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print() {
        System.out.println(thingsToPrint);
    }

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();
        Printer<Double> printer2 = new Printer<>(23.07);
        printer2.print();
    }
}
