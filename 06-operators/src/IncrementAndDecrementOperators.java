public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        System.out.println("pre increase");
        int a = 1;
        System.out.println("initial value of a = " + a);
        int b = ++a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("post increase");
        a = 2;
        System.out.println("initial value of a = " + a);
        b = a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("pre decrease");
        a = 3;
        System.out.println("initial value of a = " + a);
        b = --a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("post decrease");
        a = 4;
        System.out.println("initial value of a = " + a);
        b = a--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("(++b) = " + (++b));
        System.out.println("(b++) = " + (b++));
        System.out.println("b = " + b);
        System.out.println("(--b) = " + (--b));
        System.out.println("(b--) = " + (b--));
        System.out.println("b = " + b);
    }
}
