package com.hypergeekturtles.assignment19;

public class BinarySearchInt {

    public static void main(String[] args) {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97 };
        int target = 67;

        System.out.println(binarySearchInt(primes, target));

    }

    public static int binarySearchInt(int[] primes, int target) {
        int min = 0;
        int max = primes.length - 1;
        int guess = 0;
        while (min <= max) {
            guess = (min + max) / 2;
            if (primes[guess] == target) {
                return guess;
            } else if (primes[guess] < target) {
                min = guess + 1;
            } else {
                max = guess - 1;
            }
        }
        return -1;
    }

}
