public class HelloString {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(str.length()); // -> 11
        System.out.println(str.substring(0, 4)); // -> Hello
        System.out.println(str.substring(5)); // -> World
        System.out.println(str.startsWith("Hello")); // -> true
        System.out.println(str.endsWith("World")); // -> true
        System.out.println(str.contains("or")); // -> true
        System.out.println(str.indexOf("o")); // -> 4
        System.out.println(str.lastIndexOf("o")); // -> 7
        System.out.println("Hello Elmo".equals(str)); // -> false
        System.out.println("Hello Elmo".equals(str)); // -> false

        // Split string by space
        String[] arr = str.split(" ");
        System.out.println(arr[0]); // -> Hello
        System.out.println(arr[1]); // -> World

        // Loop through string. See
        // https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html for ASCII
        // table
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + ": " + str.charAt(i) + ", ASCII: " + (int) str.charAt(i));
        }
    }
}
