
import java.util.Scanner;

public class lollesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type in an integer");
        int A = scanner.nextInt();

        System.out.println("type in another integer");
        int B = scanner.nextInt();

        int result = 0;
        for (int i = 0; i < B; i++) {
            result = result + A; // 7
            System.out.println(result % B);
            if (result % B == 0) {
                break;
            }
        }

        System.out.println("The least common multiple of " A + " and " + B + " is " + result);
    }
}