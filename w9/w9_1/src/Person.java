public record Person(String name, int age) {

    // Niestandardowy konstruktor bez argumentów
    public Person() {
        this("Nieznane", 0); // Wywołanie domyślnego konstruktora z wartościami domyślnymi
    }
}
