
//I'm using eclipse
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money is in the bank account?");
        int money = scanner.nextInt();

        System.out.println("What is the annual interest rate?");
        double interest = scanner.nextDouble();

        System.out.println("How many years are you waiting?");
        int years = scanner.nextInt();

        double bank = money * interest * years + money;
        System.out.println("The account balance is " + bank);

        if (bank > 5000) {
            System.out.println("You're rich!");
        } else {
            System.out.println("You need to invest more you nublet");
        }
        if (bank >= 1000000) {
            System.out.println("You're a millionare!");
        }
    }
}