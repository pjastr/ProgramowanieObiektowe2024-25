import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] intArray = {5, 2, 8, -3, 1};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        double[] doubleArray = {3.14, -1.59, 2.65, 3.58};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));
        String[] stringArray = {"Banana", "apple", "Cherry", "Date"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }
}