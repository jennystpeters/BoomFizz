package com.gc.demo;

import java.util.Scanner;

/**
 * Created on 7/27/2017.
 */
public class BoomDriver {
    public static void main(String[] args) {
        BoomFizz boom = new BoomFizz();
        String val = "";
        for (int i = 0; i < 20; i++) {
            val = boom.boom(i);
            System.out.println(val);
        }

    }
}
