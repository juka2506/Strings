package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String a = "apple";
        String b = "BANANA";

        System.out.println(a.toUpperCase(Locale.ROOT));
        System.out.println(b.toLowerCase());

        String five = "5";
        int five5 = Integer.parseInt(five);

        System.out.println(Integer.max(five5, 7));


    }
}
