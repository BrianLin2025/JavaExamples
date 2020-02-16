import java.util.Scanner;

public class GC445 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in a motor name");
        String str = scanner.nextLine();

        System.out.println("Type in the motor speed");
        double ib = scanner.nextDouble();

        String result = String.format("The speed of %s is %f", str, ib);

        System.out.println(result);

        scanner.close();
    }
}
