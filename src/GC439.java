import java.util.Scanner;

public class GC439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in a word or phrase");
        String str1 = scanner.nextLine();

        System.out.println("Type in another word or phrase");
        String str2 = scanner.nextLine();

        System.out.println(str1 + " " + str2);

        scanner.close();
    }
}
