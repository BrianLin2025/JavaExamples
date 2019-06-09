import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's Your Name? (Is It PEPE?)");
        String name = scanner.nextLine();

        System.out.println("How Old Are You? (21?)");
        int age = scanner.nextInt();

        scanner.close();

        System.out.println("Name: " + name + " Age:" + age);
    }
}