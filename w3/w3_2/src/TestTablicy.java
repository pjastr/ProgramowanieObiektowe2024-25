public class TestTablicy {

    public static void main(String[] args) {
        int[] tablica = {1, 2, 3};
        modyfikujTablice(tablica);
        System.out.println(tablica[0]);
    }

    public static void modyfikujTablice(int[] arr) {
        arr = new int[3];
        arr[0]=3;
    }
}