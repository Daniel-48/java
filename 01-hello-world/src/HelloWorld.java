public class HelloWorld {
    public static void main(String[] args) {
        String greeting = "Hello World with Java";
        String name = "Daniel";
        int age = 47;
        boolean son = true;
        System.out.println(greeting.toUpperCase());
        if (age > 40) {
            System.out.println("My name is " + name + " and I'm full stack developer");
            System.out.println("I'm " + age + " years old");
        }
        if (son) {
            System.out.println("I'm going to be father of a boy named Gael");
            System.out.println("It's the best thing that ever happened to me");
        }
    }
}
