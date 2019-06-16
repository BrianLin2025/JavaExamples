import java.util.Scanner;

public class HW21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type in 3 names with commas in between each with no spaces Ex : oat,milk,egg");
        String str = scanner.nextLine();

        String[] arr = str.split(",");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }
}
