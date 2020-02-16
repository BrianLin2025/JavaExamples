import java.util.Scanner;

public class UnTiltYourBarley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many Trophies Does The Brawler Have?");
        int trophies = scanner.nextInt();

        int one = 100 - trophies;
        System.out.println("You need " + one + " more trophies to get 100 trophies on that brawler.");

        int three = 300 - trophies;
        System.out.println("You need " + three + " more trophies to get 300 trophies on that brawler");

        int five = 500 - trophies;
        System.out.println("You need " + five + " more trophies to goet 500 trophies on that brawler");
    }
}
