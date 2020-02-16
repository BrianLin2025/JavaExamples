import java.util.HashMap;

public class GC927 {
    public static void main(String[] args) {
        HashMap<String, Integer> stonks = new HashMap<String, Integer>();

        stonks.put("Brian", 26);
        stonks.put("Leo", 37);
        stonks.put("Aiden", 28);
        stonks.put("Andrew", 15);

        double sum = 0;
        double avg = 0;

        for (String key : stonks.keySet()) {
            sum = sum + stonks.get(key);
        }
        avg = sum / 4;
        System.out.println(avg);
    }
}
