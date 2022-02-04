public class WhileAndDoWhileFlowControlStatements {
    public static void main(String[] args) {
        /**
         * The while control flow structure is executed if a condition is met.
         * It first evaluates a condition and then executes.
         */
        int i = 0;
        boolean test = true;
        while (i <= 10) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println();
        while (test) {
            if (i == 20) {
                test = false;
            }
            System.out.println("i = " + i);
            i++;
        }
        test = false;
        while (test) {
            System.out.println("This code block is executed at least once");
        }
        /**
         * The do while control flow structure is executed at least once.
         * First executes and then evaluates a condition .
         */
        System.out.println();
        test = false;
        do {
            System.out.println("This code block is executed at least once");
        } while (test);
        System.out.println();
        i = 0;
        test = true;
        do {
            if (i == 10) {
                test = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (test);
    }
}
