public class ForLoopFlowControlStatement {
    public static void main(String[] args) {
        /**
         * Control flow control structure for loop.
         * With the for loop you must know the limits of the iterations, that is, the initial value and the final value.
         */
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }
        System.out.println();
        for (int i = 0, x = 10; i <= x; i++, x--) {
            System.out.println("i = " + i + " - x = " + x);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
