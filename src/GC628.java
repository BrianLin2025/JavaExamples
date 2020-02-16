import java.util.Scanner;

public class GC628 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("↓ Type ↓ in ↓ a ↓ number ↓");
        double num1 = scanner.nextInt();

        System.out.println("↓ Type ↓ in ↓ a ↓ number ↓");
        double num2 = scanner.nextInt();

        System.out.println("↓ Type ↓ in ↓ a ↓ number ↓");
        double num3 = scanner.nextInt();
        // if (num1 > num2 & num1 > num3) also works
        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The largest number is " + num3);
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest number is " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("The smallest number is " + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("The smallest number is " + num3);
        }

        scanner.close();
    }
}
