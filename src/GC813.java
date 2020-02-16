public class GC813 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40 };
        int res = sum(nums);
        System.out.println(res);
    }

    public static int sum(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res + nums[i];
        }
        return res;
    }

}