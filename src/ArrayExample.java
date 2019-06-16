import java.util.Arrays;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        String[] names = { "Elmo", "Grover", "Bert" };
        int[] ages = { 5, 2, 3 };

        System.out.println("Array length: " + ages.length);
        System.out.println("Array[0]: " + ages[0]);
        System.out.println("Array[2]: " + ages[2]);

        // loop through array without index
        for (String str : names) {
            System.out.println(str);
        }

        List<String> list = Arrays.asList(names);
        list.forEach((str) -> {
            System.out.println("function " + str);
        });

        // loop through array with index
        for (int i = 0; i < ages.length; i++) {
            System.out.println(i + ": " + ages[i]);
        }

        Arrays.sort(ages);
        System.out.println(ages[0]);
    }
}