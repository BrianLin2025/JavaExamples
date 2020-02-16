import java.util.Scanner;

public class GC522 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("↓ Type ↓ in ↓ a ↓ number ↓");
        int num = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i * num);
        }

        scanner.close();
    }
}