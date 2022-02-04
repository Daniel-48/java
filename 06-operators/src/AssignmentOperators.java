public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 47;
        int b = a + 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a += 1;
        System.out.println("a = " + a);
        a -= 1;
        System.out.println("b = " + a);
        a *= 4.3;
        System.out.println("a = " + a);
        a /= 2;
        System.out.println("a = " + a);
        String query = "SELECT * FROM customers ";
        query += "WHERE name='Gael';";
        System.out.println("query = " + query);
    }
}
