package com.controlflow;
public class FirstLastDigitSum {
    public FirstLastDigitSum() {
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastdig;
            for(lastdig = number % 10; number >= 10; number /= 10) {
            }

            return number + lastdig;
        }
    }
}

