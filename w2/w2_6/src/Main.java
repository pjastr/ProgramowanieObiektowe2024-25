public class Main {
    public static void main(String[] args) {
        System.out.println(suma(3,4));
        printNumbers(1, 2, 3, 4, 5);   // Wydrukuje: 1 2 3 4 5
        printNumbers(10, 20);         // Wydrukuje: 10 20
        printNumbers();               // Nic nie wydrukuje
        int[] array = {1, 2, 3};
        printNumbers(array);
    }

    public static int suma(int a, int b)
    {
        return a+b;
    }

    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}