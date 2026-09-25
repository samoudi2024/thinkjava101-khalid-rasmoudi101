public class Question7 {
    public static void main(String[] args) {

        int x = 5;  // integer variable storing 5
        int y = 5;  // integer variable storing 5

        // Comparing primitive types
        System.out.println(x == y);  // true  (5 equals 5)
        System.out.println(x != y);  // false (5 is not different from 5)

        // Comparing String objects
        String a = new String("Java");  // creates a NEW String object in memory
        String b = new String("Java");  // creates ANOTHER NEW String object in memory

        System.out.println(a == b);      // false (different objects in memory)
        System.out.println(a.equals(b)); // true  (same content "Java")
    }
}
