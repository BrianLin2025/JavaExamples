import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose A Number!");
        int number1 = scanner.nextInt();

        System.out.println("Choose Another Number!");
        int number2 = scanner.nextInt();

        scanner.close();

        int sum = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + sum);

        int diff = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + diff);
    }
}