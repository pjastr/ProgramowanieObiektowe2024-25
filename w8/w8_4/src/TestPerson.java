public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("John", 20);
        Employee e1 = new Employee("John", 20, "AA");
        System.out.println(p1.equals(e1));
        Person p2 = new Person("John", 20);
        System.out.println(p1.hashCode()== p2.hashCode());
        Employee e2 = new Employee("John", 20, "AA");
        System.out.println(e1.hashCode() == e2.hashCode());
    }
}
