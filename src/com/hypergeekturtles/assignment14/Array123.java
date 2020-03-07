package com.hypergeekturtles.assignment14;

public class Array123 {

    public static void main(String[] args) {
        int[] nums = { 5, 3, 6, 1, 2, 4, 6, 1 };
        boolean answer = array123(nums);
        System.out.println(answer);
    }

    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            // System.out.println(i);
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

}
