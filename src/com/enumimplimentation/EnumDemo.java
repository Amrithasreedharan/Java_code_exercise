package com.enumimplimentation;
enum Week{
    sunday,monday,tuesday,wednesday,thursday,friday;
}
public class EnumDemo {
    public static void main(String[] args) {
        Week day = Week.friday;
        Week[] value = Week.values();
        System.out.println(day);
        System.out.println(day.ordinal());
        for (Week w : value) {
            System.out.print(w + " ");
        }
        System.out.println();
        if(day==Week.friday){
            System.out.println("hai its friday!!! yeyyy:)");
        }else{
            System.out.println("have to work");
        }
    }
}
