package com.gc.demo;

/**
 * Created on 7/27/2017.
 */
public class BoomFizz {
    /*
    Accepts integer input values and returns "Boom" if the input number is
    divisible by 7 or contains the digit 7, otherwise return the input value.
    */
    public String boom(int number) {
        String val = "";
        String numberString = Integer.toString(number);

        if (number % 7 == 0 || String.valueOf(number).contains("7")) {
            val = "Boom";
        } else {
            return val = numberString;
        }
        return val;
    }
}
