public class StringConcatenation {
    public static void main(String[] args) {
        String course = "Java Programming";
        String teacher = "Miguel Sutil Martin";
        String detail = course + " with the instructor " + teacher;
        String name = "Daniel";
        String surnames = "Pompa Pareja";
        String student = name.concat(" ").concat(surnames);
        System.out.println(detail);
        System.out.println("student: " + student);
    }
}
