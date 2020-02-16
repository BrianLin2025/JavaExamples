package com.hypergeekturtles.assignment12;

public class SleepIn {

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false)); // true
        System.out.println(sleepIn(false, true)); // true
        System.out.println(sleepIn(true, false)); // false
        System.out.println(sleepIn(true, true)); // true
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) {
            return false;
        }
        return true;
    }
}
