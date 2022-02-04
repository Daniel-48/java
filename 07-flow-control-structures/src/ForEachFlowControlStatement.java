public class ForEachFlowControlStatement {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        String[] names = {"Gael", "Emma", "Daniel"};
        for(int number : numbers) {
            System.out.println("number = " + number);
        }
        System.out.println();
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}
