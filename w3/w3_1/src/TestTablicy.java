public class TestTablicy {

    public static void main(String[] args) {
        int[] tablica = {1, 2, 3};
        modyfikujTablice(tablica);
        System.out.println(tablica[0]); // Wydrukuje "42", a nie "1"
    }

    public static void modyfikujTablice(int[] arr) {
        arr[0] = 42;
    }
}