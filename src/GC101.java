import java.util.ArrayList;
import java.util.Scanner;

public class GC101 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Type in a number");
            int num1 = scanner.nextInt();
            numbers.add(num1);
        }
        scanner.close();

        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
