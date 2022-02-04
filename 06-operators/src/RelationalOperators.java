public class RelationalOperators {
    public static void main(String[] args) {
        int a = 3;
        byte b = 7;
        float c = 102.4F;
        double d = 2.156;
        boolean e = false;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("Relational operators");
        boolean result1 = a == b;
        System.out.println("a == b: " + result1);
        boolean result2 = a != b;
        System.out.println("a != b: " + result2);
        result1 = !result2;
        System.out.println("result1 = !result2: " + result2);
        boolean result3 = e == true;
        System.out.println("result3 = e == true: " + result3);
        boolean result4 = e != true;
        System.out.println("result4 = e != true: " + result4);
        boolean result5 = a > b;
        System.out.println("a > b: " + result5);
        boolean result6 = a < b;
        System.out.println("a < b: = " + result6);
        boolean result7 = c >= d;
        System.out.println("c >= d: " + result7);
        boolean result8 = c <= d;
        System.out.println("c <= d: " + result8);
        boolean result9 = d <= c;
        System.out.println("d <= c: " + result9);
    }
}
