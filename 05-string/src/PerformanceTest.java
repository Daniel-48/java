public class PerformanceTest {
    public static void main(String[] args) {
        String a = "a", b = "b", c = a;
        StringBuilder sb = new StringBuilder(a);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(a).append(b).append("\n");
            // c = c.concat(a).concat(b).concat("\n");
            // c += a + b + "\n";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());
    }
}
