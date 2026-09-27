public class Challenge1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;

        // Prediction: a + b * 2 -> multiplication happens first (3*2=6), then 8+6 = 14
        // Prediction: (a + b) * 2 -> parentheses happen first (8+3=11), then 11*2 = 22
        System.out.println(a + b * 2);
        System.out.println((a + b) * 2);

        // The answers differ because operator precedence makes * happen before +
        // unless parentheses force the addition to happen first.
    }
}
