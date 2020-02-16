import java.util.Scanner;

public class hb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in a word or phrase");
        String str = scanner.nextLine();

        System.out.println("The character at position 0 is " + str.charAt(0));
        System.out.println("The character at position 10 is " + str.charAt(10));

        scanner.close();
    }
}