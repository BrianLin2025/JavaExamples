public class GC102 {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<String>();
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Type in a name");
//            String name = scanner.nextLine();
//            names.add(name);
//        }
//        Collections.sort(names);
//        System.out.println(names.get(0) + ", " + names.get(2));
//
//        scanner.close();

        int result = 1;
        for (int i = 0; i < 3; i++) {
            result = result * 2;
        }
        System.out.println(result);
    }
}
