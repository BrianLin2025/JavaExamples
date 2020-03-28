package com.hypergeekturtles.assignment18;

public class IterativeFactorial {

    public static void main(String[] args) {
        int n = 5;

        System.out.println("The factorial of " + n + " is " + iterativeFactorial(n));
    }

    public static int iterativeFactorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }
}
