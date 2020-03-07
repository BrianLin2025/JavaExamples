package com.hypergeekturtles.assignment14;

public class Reverse3 {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };

        int[] newNums = reverse3(nums);
        for (int i = 0; i < 3; i++) {
            System.out.print(newNums[i]);
            if (i != 2) {
                System.out.print(", ");
            }
        }
    }

    public static int[] reverse3(int[] nums) {
        int one = 0;
        one = nums[0];
        nums[0] = nums[2];
        nums[2] = one;
        return nums;
    }

}
