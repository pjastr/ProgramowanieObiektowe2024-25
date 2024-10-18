import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println(list);
        String[] tab = {"AA","BB","CC"};
        System.out.println(tab);
        System.out.println(Arrays.toString(tab));

        ArrayList<String> list3 = null;
// list.add("test");  // Błąd! Wyjątek NullPointerException
        //list3.add("adsfd");
    }
}