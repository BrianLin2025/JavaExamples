
public class GC825 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 8 }, { 3, 9, 6 }, { 5, 7, 2 } };
        System.out.println(isSudoku(arr));
    }

    public static boolean isSudoku(int[][] arr) {
        // check if 3x3 nums is a solved sudoku

        // check if all the sum of each row is 15
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + arr[i][j];
            }
            if (sum != 15) {
                return false;
            }
        }

        return true;
    }

}
