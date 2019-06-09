import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a Number OAT MILK");
        int a = scanner.nextInt();

        int smallest = a;

        System.out.println("Choose another Number OAT MILK");
        int b = scanner.nextInt();

        if (b < smallest) {
            smallest = b;
        }

        System.out.println("Choose a third Number OAT MILK");
        int c = scanner.nextInt();

        if (c < smallest) {
            smallest = c;
        }

        System.out.println(smallest + " is the smallest");
    }
}