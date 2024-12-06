public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("John", 20);
        Person p2 = new Person("John", 20);
        System.out.println(p1.equals(p2));
        Person p3 = new Person(null, 20);
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p1));
    }
}
