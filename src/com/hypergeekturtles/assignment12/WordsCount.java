package com.hypergeekturtles.assignment12;

public class WordsCount {
    public static void main(String[] args) {

        String[] words = { "hyper", "geek", "turtles" };
        int count = wordsCount(words, 4);

        System.out.println("there are " + count + " word(s) that are 4 long");
    }

    public static int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }
        return count;
    }
}
