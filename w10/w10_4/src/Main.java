//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        double result = 0.0;

        try {
            result = divide(numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.println("Wystąpił wyjątek: " + e.getMessage());
        } finally {
            System.out.println("Blok finally został wykonany.");
        }

        System.out.println("Wynik dzielenia: " + result);
    }

    public static double divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}