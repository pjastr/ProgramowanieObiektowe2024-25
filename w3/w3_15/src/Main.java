public class Main {

    public static void main(String[] args) {
        String s1 = "";
        String s2 = null;

        //System.out.println(s1.equals(""));  // true
        //System.out.println(s1.length());
        //System.out.println(s2.equals(null));  // Wyjątek: NullPointerException
        if (s2 != null)
            System.out.println(s2.length());
    }
}
