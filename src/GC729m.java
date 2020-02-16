import java.util.Scanner;

public class GC729m {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in a number");
        double num = scanner.nextDouble();

        double newNum = clip(num);
        System.out.println(newNum);

        scanner.close();
    }

    public static double clip(double num) {
        if (num >= 1) {
            return 1;
        } else if (num <= -1) {
            return -1;
        } else {
            return num;
        }
    }

}
