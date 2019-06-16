
public class StringExample {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(str.length());
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(6));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World"));
        System.out.println(str.contains("Pepe"));
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));
        System.out.println("Hello Pepe".equals(str));

        String[] arr = str.split("o");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + ": " + str.charAt(i) + ", ASCII: " + (int) str.charAt(i));
        }
    }
}