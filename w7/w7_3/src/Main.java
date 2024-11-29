import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("WW");
        a1.add("XX");
        a1.add("YY");
        MyImmutableClass m1 = new MyImmutableClass(5, "AA", a1);
        System.out.println(m1);
        a1.add("UU");
        System.out.println(m1);
        ArrayList<String> a2 =  m1.getItems();
        a2.add("KK");
        System.out.println(m1);
    }
}
