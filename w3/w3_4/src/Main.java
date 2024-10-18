import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tablica = {34, 12, 5, 78, 2, 10, 8};
        Arrays.sort(tablica);
        for (int i = 0; i < tablica.length / 2; i++) {
            int temp = tablica[i];
            tablica[i] = tablica[tablica.length - 1 - i];
            tablica[tablica.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(tablica));
    }
}