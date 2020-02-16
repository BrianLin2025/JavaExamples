import java.util.Scanner;

public class GC735 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in a number");
        double num = scanner.nextDouble();

        double result = gauss(num);
        System.out.println(result);

        scanner.close();
    }

    public static double gauss(double num) {
        double gm = 0;
        for (int i = 1; i <= num; i++) {
            gm = gm + i;
        }

        return gm;

    }

}
