import java.util.Scanner;

public class hb4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type in a radius");
        int rad = scanner.nextInt();

        double per = 2 * rad * 3.14;
        double area = rad * rad * 3.14;

        System.out.println("The perimeter is " + per);
        System.out.println("The area is " + area);

        scanner.close();
    }
}