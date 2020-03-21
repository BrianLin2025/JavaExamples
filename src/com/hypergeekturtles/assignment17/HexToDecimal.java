package com.hypergeekturtles.assignment17;

public class HexToDecimal {

    public static void main(String[] args) throws Exception {
        // a) 110000
        // b) A6
        // c) 168C14

        System.out.println(hexToDecimal("A")); // --> 10
        System.out.println(hexToDecimal("3B")); // --> 59
        System.out.println(hexToDecimal("3A5E")); // --> 14942
    }

    public static int convertLetterToNum(char c) throws Exception {
//        if(c == 'A') {
//            return 10;
//        } else if (c == 'B') {
//            return 11;
//        } else if (c == 'C') {
//            return 12;
//        } else if (c == 'D') {
//            return 13;
//        } else if (c == 'E') {
//            return 14;
//        } else if (c == 'F') {
//            return 15;
//        } else {
//            return c - '0';
//        }
//
        String str = "0123456789ABCDEF";
        int result = str.indexOf(c);
        if (result < 0) {
            throw new Exception("invalid char found: " + c);
        }
        return result;
    }

    public static int hexToDecimal(String hex) throws Exception {
        int dec = 0;
        int length = hex.length();
        for (int i = 0; i < length; i++) {
            // flip hex
            char c = hex.charAt(length - 1 - i);

            // change letters to num
            int decimal = convertLetterToNum(c);

            // convert
            dec += (int) (decimal * Math.pow(16, i));
        }
        return dec;
    }

}
