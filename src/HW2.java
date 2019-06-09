import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How Old Are You?");
        int number1 = scanner.nextInt();

        scanner.close();

        if (number1 >= 13 && number1 <= 19) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are not a teenager");
        }
    }
}