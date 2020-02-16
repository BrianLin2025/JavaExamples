package com.hypergeekturtles.assignment12;

public class ScoresIncreasing {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };

        System.out.println(scoresIncreasing(numbers));
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
