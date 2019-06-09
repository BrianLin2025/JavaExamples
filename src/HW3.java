import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer bub");
        int x = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= x; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
    }
}