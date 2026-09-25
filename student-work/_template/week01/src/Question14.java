// Question 14 — Assignment Operators
public class Question14 {
    public static void main(String[] args) {

        int x = 10;
        x += 5; // x = 15
        System.out.println("x += 5  → x = " + x); // 15
        x -= 2; // x = 13
        System.out.println("x -= 2  → x = " + x); // 13
        x *= 3; // x = 39
        System.out.println("x *= 3  → x = " + x); // 39
        x /= 3; // x = 13
        System.out.println("x /= 3  → x = " + x); // 13
        x %= 5; // x = 3
        System.out.println("x %= 5  → x = " + x); // 3

        int a, b;
        a = b = 10; // right to left: b=10 first, then a=10
        System.out.println("a = " + a + ", b = " + b); // a=10, b=10
    }
}
