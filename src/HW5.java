import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose A Number          OAT MILK");
        int base = scanner.nextInt();

        System.out.println("Choose Another Number          OAT MILK");
        int exponent = scanner.nextInt();

        int answer = 1;

        for (int i = 0; i < exponent; i++) {
            answer = answer * base;
        }

        System.out.println("answer = " + answer);
    }
}