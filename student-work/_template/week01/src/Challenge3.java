public class Challenge3 {
    public static void main(String[] args) {
        int score = 85;
        boolean completedHomework = true;

        boolean passed = score >= 70 && completedHomework;
        System.out.println(passed ? "Pass" : "Needs more work");
    }
}
