public class Immutability {
    public static void main(String[] args) {
        String course = "Java Programming";
        String teacher = "Miguel Sutil Martin";
        String result = course.concat(" with ").concat(teacher);
        System.out.println("course = " + course);
        System.out.println("detail = " + result);
        System.out.println(course == result);
    }
}
