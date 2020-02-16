import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> namesmap = new HashMap<>();

        System.out.println("type in names with commas between each with no spaces Ex : oat,milk,egg");
        String names = scanner.nextLine();

        scanner.close();

        String[] arr = names.split(",");

        for (int i = 0; i < arr.length; i++) {
            namesmap.put(arr[i], arr[i].length());
        }

        for (String key : namesmap.keySet()) {
            System.out.println(key + ", " + namesmap.get(key));
        }
    }
}
