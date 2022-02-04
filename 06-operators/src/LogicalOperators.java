public class LogicalOperators {
    public static void main(String[] args) {
        int a = 6;
        byte b = 6;
        float c = 102.4F;
        double d = 2.156;
        boolean e = false;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        boolean result1 = a == b && c > d;
        System.out.println("a == b && c > d: " + result1);
        boolean result2 = a == b && c < d;
        System.out.println("a == b && c < d: " + result2);
        boolean result3 = a == b && c > d && e == true;
        System.out.println("a == b && c > d && e == true: " + result3);
        boolean result4 = a == b && c > d && e == false;
        System.out.println("a == b && c > d && e == false: " + result4);
        boolean result5 = a == b || c < d;
        System.out.println("a == b || c < d: " + result5);
        boolean result6 = a > c || d < a;
        System.out.println("a > c || d < a: " + result6);
        boolean result7 = a == b && c < d || e == false;
        System.out.println("a == b && c < d || e == false: " + result7);
    }
}
