import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> listaInt = new ArrayList<>();
        listaInt.add(1);  // Autoboxing konwertuje 'int' na 'Integer'
        int liczba = listaInt.get(0);  // Autounboxing konwertuje 'Integer' na 'int'
    }
}
