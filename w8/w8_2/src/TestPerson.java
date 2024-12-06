public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("John", 20);
        Person p2 = new Person("John", 20);
        Person p3 = p1;
        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p2 == p3);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
        Person p4 = null;
        //System.out.println(p4.equals(p1));
        System.out.println(p1.equals(p4));
    }
}
