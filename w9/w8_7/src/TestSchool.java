import education.School;
import education.University;

public class TestSchool {

    public static void main(String[] args) {
        School s1 = new School("AA", "BB", 234);
        System.out.println(s1.equals(null));
        System.out.println(s1.hashCode());
        s1.recruitment(34);
        System.out.println(s1);
        University u1 = new University("AA", "FF", 23, "PP", 3);
        System.out.println(u1.equals(u1));
        System.out.println(u1.hashCode());
        u1.recruitment(23);
        System.out.println(u1);
    }
}
