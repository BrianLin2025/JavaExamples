package com.hypergeekturtles.assignment19;

public class BinarySearchString {

    public static void main(String[] args) {
        String[] dictionary = { "apple", "banana", "carrot", "dragonfruit", "eggplant", "lemon", "watermelon" };
        String word = "carrot";
        System.out.println(binarySearchString(dictionary, word));
    }

    public static int binarySearchString(String[] dictionary, String word) {
        int min = 0;
        int max = dictionary.length - 1;
        int location = 0;
        while (min <= max) {
            location = (min + max) / 2;
            int result = dictionary[location].compareTo(word);
            if (result == 0) {
                return location;
            } else if (result < 0) {
                min = location + 1;
            } else {
                max = location - 1;
            }
        }
        return -1;
    }

}
