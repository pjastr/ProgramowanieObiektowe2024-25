public class Main {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = new String("Hello");
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1));
    }
}

class Person{
    private int age;
}
