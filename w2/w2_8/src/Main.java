public class Main {

    public static void main(String[] args) {
        int[] tab1 = {4,5,6};
        int[] tab2 = new int[5];
        for(int i=0;i<tab1.length;i++){
            System.out.println(tab2[i]);
        }

        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = tablica1;

        tablica2[0] = 42;

        System.out.println(tablica1[0]); // wydrukuje "42", a nie "1"
    }
}
