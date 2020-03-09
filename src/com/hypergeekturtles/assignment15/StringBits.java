package com.hypergeekturtles.assignment15;

public class StringBits {

    public static void main(String[] args) {
        String str = "Hello";
        String result = stringBits(str);
        System.out.println(result);
    }

    public static String stringBits(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i = i + 2) {
            answer = answer + str.substring(i, i + 1);
        }
        return answer;
    }
}
