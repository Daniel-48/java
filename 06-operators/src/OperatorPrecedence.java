public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10, b = 6, c = 8;
        double average = (a + b + c) / 3d; // 10 + 6 + 8 / 3
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("average = " + average);
        average = a + b + c / 3d * 10; // 8 / 3 * 10 + 10 + 6
        System.out.println("average = " + average);
        average = a + b + c / (3d * 10); // 3 * 10 -> 8 / 30 + 10 + 6
        System.out.println("average = " + average);
        average = (a + b + c) / 3d * 10; // 10 + 6 + 8 / 3 * 10
        System.out.println("average = " + average);
        average = ++a + b-- + c / 3d * 10; // 10 + 1 -> + 5 -> 8 / 3 * 10
        System.out.println("average = " + average);
    }
}
