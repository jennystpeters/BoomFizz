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
        //if (number % 7 == 0 || checkNumber(numberString)) {
        //if (number % 7 == 0 || checkNumber(number)) {
        if (number % 7 == 0 || String.valueOf(number).contains("7")) {
            val = "Boom";
        } else {
            return val = numberString;
        }
        return val;
    }



/*    public Boolean checkNumber (int number) {
        if (String.valueOf(number).contains("7")){
            return true;
        }
        return false;
    }*/

/*    public Boolean checkNumber(String numberString) {
        Boolean containSeven = false;
        char sevenString = '7';
        for (int i = 0; i < numberString.length(); i++) {
            if(numberString.charAt(i)==sevenString){
                containSeven = true;
            }
        }
        return containSeven;
    }*/
}
