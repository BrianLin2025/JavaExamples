import java.util.Scanner;

public class GC636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("↓ Type ↓ in ↓ a ↓ number ↓");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();

    }
}
//----------------------
//  ___  ____  _____    \
//  |  \|    |   |       \
//  |_ /|    |   |        \
//  | \ |    |   |         \     _______
//  |_/ |____| __|__    ____\   /       \
//                    --      _/  0  0  _\
//__________________--       |_  _____ |_
//                            _\       _ /
//                           |__\_____|_/