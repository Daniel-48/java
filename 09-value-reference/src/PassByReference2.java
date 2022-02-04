public class PassByReference2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Daniel");
        person.setSurname("Pompa Pareja");
        System.out.println("Start of the main method");
        System.out.println("person.getName() = " + person.getName());
        System.out.println("person.getSurname() = " + person.getSurname());
        System.out.println("person.toString() = " + person.toString());
        System.out.println("End of main method");
        System.out.println("Before invoking test method");
        System.out.println("person.toString() = " + person.toString());
        test(person);
        System.out.println("After invoking test method");
        System.out.println("person.getName() = " + person.getName());
        System.out.println("person.getSurname() = " + person.getSurname());
        System.out.println("person.toString() = " + person.toString());
    }

    public static void test(Person p) {
        System.out.println("Start of the test method");
        p.setName("Gael");
        p.setSurname("Pompa Ciambrino");
        System.out.println("End of test method");
    }
}
