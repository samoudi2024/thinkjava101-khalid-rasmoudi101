public class Challenge2 {
    public static void main(String[] args) {
        int x = 5;

        // Prediction: x++ prints 5 (the old value), then x becomes 6
        System.out.println(x++); // expected: 5
        System.out.println(x);   // expected: 6

        x = 5;

        // Prediction: ++x increments first, then prints 6
        System.out.println(++x); // expected: 6
        System.out.println(x);   // expected: 6

        // Postfix (x++) returns the original value before incrementing,
        // while prefix (++x) increments first and returns the new value.
    }
}
