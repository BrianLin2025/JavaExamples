public class uvuvue {
    public static void main(String[] args) {
        int[][] kukids = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int ree = egg(kukids);
        System.out.println(ree);
        System.out.println(kukids);
    }

    public static int egg(int[][] kukids) {
        int ree = 0;
        for (int i = 0; i < kukids.length; i++) {
            for (int j = 0; j < kukids[i].length; j++) {
                if (kukids[i][j] % 2 == 0) {
                    ree++;
                }
            }
        }
        return ree;
    }
}