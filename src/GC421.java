import java.util.Scanner;

public class GC421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in a word or phrase");
        String str1 = scanner.nextLine();

        System.out.println("Type in another word or phrase");
        String str2 = scanner.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println(str1 + " is equal to " + str2);
        } else {
            System.out.println(str1 + " is not equal to " + str2);
        }

        scanner.close();
    }
}