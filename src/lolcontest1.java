import java.util.Scanner;

public class lolcontest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer bub");
        int integer = scanner.nextInt();

        int sum = 1;

        for (int i = 1; i <= integer; i++) {
            sum = i * sum;
        }
        System.out.println("The factorial of " + integer + " is " + sum);
    }
}