package com.hypergeekturtles.assignment13;

public class ScoreUp {

    public static void main(String[] args) {
        String[] key = { "a", "a", "b", "b" };
        String[] answers = { "a", "c", "b", "c" };

        int score = scoreUp(key, answers);
        System.out.println("score: " + score);
    }

    public static int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) {
                score = score + 4;
            } else if (answers[i].equals("?")) {

            } else {
                score = score - 1;
            }
        }
        return score;
    }

}
