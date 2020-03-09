package com.hypergeekturtles.assignment15;

public class EndUp {

    public static void main(String[] args) {
        String str = "hello";
        String result = endUp(str);
        System.out.println(result);
    }

    public static String endUp(String str) {
        if (str.length() >= 3) {
            String first = str.substring(0, str.length() - 3);
            String last3 = str.substring(str.length() - 3, str.length());
            String last3Upcase = last3.toUpperCase();
            return first + last3Upcase;
        } else {
            return str.toUpperCase();
        }
    }

}
