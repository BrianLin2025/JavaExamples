
import java.util.Scanner;

public class Contest2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("type in an integer");
        int integer1 = scanner.nextInt();

        System.out.println("type in another integer");
        int integer2 = scanner.nextInt();

        System.out.println("type in a third integer");
        int integer3 = scanner.nextInt();

        if (integer1 < integer2 && integer1 < integer3 && integer2 <= integer3) {
            System.out.println("ascending");
        }
        if (integer1 < integer2 && integer1 < integer3 && integer3 <= integer2) {
            System.out.println("descending");
        }
        if (integer2 < integer1 && integer2 < integer3 && integer1 <= integer3) {
            System.out.println("neither");
        }
        if (integer2 < integer1 && integer2 < integer3 && integer3 <= integer2) {
            System.out.println("descending");
        }
        if (integer3 < integer2 && integer3 < integer1 && integer2 <= integer1) {
            System.out.println("descending");
        }
        if (integer3 < integer2 && integer3 < integer1 && integer1 <= integer2) {
            System.out.println("neither");
        }
    }
}