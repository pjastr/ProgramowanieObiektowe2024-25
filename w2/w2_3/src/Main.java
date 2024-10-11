public class Main {
    public static void main(String[] args) {
        for (Dzien d : Dzien.values()) {
            System.out.println(d);
        }
    }
}

enum Dzien {
    PONIEDZIALEK, WTOREK, SRODA, CZWARTEK, PIATEK, SOBOTA, NIEDZIELA
}