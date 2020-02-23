package com.hypergeekturtles.assignment13;

public class Sum13 {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 6, 2, 13, 5, 2, 5 };
        System.out.println(sum13(nums));
    }

    public static int sum13(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                break;
            } else {
                ans = ans + nums[i];
            }
        }
        return ans;
    }

}
