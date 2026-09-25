public class Question5 {
    public static void main(String[] args) {

        int x = 4;  // binary: 00000000 00000000 00000000 00000100

        // Print all values
        System.out.println(x << 1);    // 8
        System.out.println(8 >> 1);    // 4
        System.out.println(-8 >>> 1);  // 2147483644
    }
}
