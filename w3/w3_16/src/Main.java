public class Main {

    public static void main(String[] args) {
        String s1 = "Informatyka";
        String s2 = s1.replace("f", "W");
        System.out.println(s1);
        System.out.println(s2);
        StringBuilder sb = new StringBuilder("Hello Java");
        sb.replace(6, 10, "World");
        System.out.println(sb);
    }
}
