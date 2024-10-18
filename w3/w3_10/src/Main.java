import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

// Dodawanie elementów
        list.add("A");
        list.add("B");
        list.add("C");

// Odczytywanie elementów
        String element = list.get(1);  // B

// Ustalanie rozmiaru listy
        int size = list.size();  // 3

// Usuwanie elementu
        list.remove(1);  // Usuwa element "B"
    }
}
