import java.util.Scanner;

public class HW33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type in 5 whole numbers with commas seperating them (no spaces)");
        int[] numbers = scanner.nextInt();

        Integer[] arr = numbers.split(",");

    }
}