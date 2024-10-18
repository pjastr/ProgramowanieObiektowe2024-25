import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tablica1 = {1, 2, 3, 4, 5};
        int[] tablica2 = {1, 2, 3, 4, 5};
        int[] tablica3 = {5, 4, 3, 2, 1};
        boolean czyRowne1i2 = Arrays.equals(tablica1, tablica2); // true
        boolean czyRowne1i3 = Arrays.equals(tablica1, tablica3); // false
        System.out.println("Czy tablica1 jest równa tablica2? " + czyRowne1i2);
        System.out.println("Czy tablica1 jest równa tablica3? " + czyRowne1i3);
        System.out.println(tablica1 == tablica2);
    }
}