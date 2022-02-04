public class LabelsLoopFlowControlStatement {
    public static void main(String[] args) {
        loop1:
        for (int i = 0; i <= 5; i++) {
            System.out.println();
            for (int j = 0; j <= 5; j++) {
                if (i == 2) {
                    continue loop1;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }
        System.out.println("\n\n====================================================================================");
        loop2:
        for (int i = 0; i <= 5; i++) {
            System.out.println();
            for (int j = 0; j <= 5; j++) {
                if (i == 2) {
                    break loop2;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }
        System.out.println("\n====================================================================================\n");
        loop3:
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i == 6 || i == 7) {
                    System.out.println("Day " + i + " weekend rest day");
                    continue loop3;
                }
                System.out.println("Day " + i + ", working at " + j + " hours");
            }
        }
    }
}
