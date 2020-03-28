package com.hypergeekturtles.assignment18;

public class RecursiveFactorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("The factorial of " + n + " is " + recursiveFactorial(n));
    }

    public static int recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }
}
