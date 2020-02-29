package com.hypergeekturtles.assignment13;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] nums = { 6, 2, 5, 8 };
        System.out.println(firstLast6(nums));
    }

    public static boolean firstLast6(int[] nums) {

        if (nums[0] == 6) {
            return true;
        } else if (nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }
}
