public class PassByValue {
    public static void main(String[] args) {
        // All primitive type variables are passed by value and not by reference
        int a = 10;
        System.out.println("Start of the main method with a = " + a);
        test(a);
        System.out.println("End of main method with a = " + a);
    }

    public static void test(int i) {
        System.out.println("Start of the test method with a = " + i);
        i = 47;
        System.out.println("End of test method with a = " + i);
    }
}
