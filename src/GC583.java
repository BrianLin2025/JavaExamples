import java.util.Scanner;

public class GC583 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("↓ Type ↓ in ↓ a ↓ number ↓");
        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Hello World");
        }

        scanner.close();
    }
}
