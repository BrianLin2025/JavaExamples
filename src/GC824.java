
public class GC824 {
    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int res = evenNum(nums);
        System.out.println(res);
    }

    public static int evenNum(int[][] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
//            System.out.println("nums[" + i + "].length: " + nums[i].length);
            for (int j = 0; j < nums[i].length; j++) {
//                System.out.println(String.format("nums[%d][%d]: %d", i, j, nums[i][j]));
                if (nums[i][j] % 2 == 0) {
                    res = res + 1;
                }
            }
        }
        return res;
    }

}
