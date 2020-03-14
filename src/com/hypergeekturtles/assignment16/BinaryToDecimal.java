package com.hypergeekturtles.assignment16;

public class BinaryToDecimal {

    public static void main(String[] args) {
        System.out.println(binaryToDecimal("111")); // 7
        System.out.println(binaryToDecimal("1010")); // 10
        System.out.println(binaryToDecimal("100001")); // 33
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            if (binary.charAt(i) == '1') {
                decimal = decimal + (int) Math.pow(2, (length - 1 - i));
            }
        }
        return decimal;
    }

}
