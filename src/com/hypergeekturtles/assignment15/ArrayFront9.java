package com.hypergeekturtles.assignment15;

public class ArrayFront9 {

    public static void main(String[] args) {
        int[] nums = { 1, 4, 9, 5, 6 };
        boolean answer = arrayFront9(nums);
        System.out.println(answer);

    }

    public static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

}
