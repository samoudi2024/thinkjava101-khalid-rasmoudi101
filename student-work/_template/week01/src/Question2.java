public class Question2 {
    public static void main(String[] args) {

        int a = 5;
        int b = ++a;  // prefix: a becomes 6 first, then b = 6
        int c = -a;   // c = -6 (negative of a)

        boolean ready = true;

        // Print all values
        System.out.println("a = " + a);       // 6
        System.out.println("b = " + b);       // 6
        System.out.println("c = " + c);       // -6
        System.out.println(!ready);            // false
        System.out.println(~5);               // -6
    }
}
