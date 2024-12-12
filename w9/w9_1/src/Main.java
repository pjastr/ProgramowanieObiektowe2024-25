
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jan", 34);
        System.out.println(p1);
        Person p2 = new Person("Jan", 22);
        Person p3 = new Person("Jan", 34);
        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p2 == p3);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
        Person defaultPerson = new Person();
        System.out.println("Domyślna osoba: " + defaultPerson);

    }
}