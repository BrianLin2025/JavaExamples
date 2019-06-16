import java.util.Scanner;

class Contest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What Is The Length?");
        int length = scanner.nextInt();

        System.out.println("What Is The Width?");
        int width = scanner.nextInt();

        int area = length * width;
        System.out.println("area = " + area);

        int perimeter = length + width * 2;
        System.out.println("perimeter = " + perimeter);

        double diagonal = Math.sqrt(length * length + width * width);
        System.out.println("diagonal line = " + diagonal);
    }
}