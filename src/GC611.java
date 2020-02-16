import java.util.Scanner;

public class GC611 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type ↓ in ↓ a ↓ number ↓");
        double num1 = scanner.nextInt();

        System.out.println("Type ↓ in ↓ a ↓ number ↓");
        double num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

        scanner.close();
    }
}
