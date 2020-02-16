import java.util.Scanner;

public class GC772M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in a number");
        double num1 = scanner.nextDouble();

        System.out.println("Type in a number");
        double num2 = scanner.nextDouble();

        System.out.println("Type in a number");
        double num3 = scanner.nextDouble();

        double avg = average(num1, num2, num3);
        System.out.println("The average is " + avg);

        scanner.close();
    }

    public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

}
