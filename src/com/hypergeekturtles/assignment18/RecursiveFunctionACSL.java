package com.hypergeekturtles.assignment18;

public class RecursiveFunctionACSL {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(recFunc(n));
    }

    public static int recFunc(int n) {
        if (n < 4) {
            return n * 2;
        } else {
            return recFunc(n - 1) + n;
        }
    }

}
