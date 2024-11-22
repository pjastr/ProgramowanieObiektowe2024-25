public class TestConfiguration {
    public static void main(String[] args) {
        Configuration.displayConfig();
    }
}


class Configuration {
    public static final int CONFIG_FEATURE;

    static {
        // Można tutaj wykonywać złożone operacje inicjalizacyjne
        CONFIG_FEATURE = initializeConfiguration();
    }

    private static int initializeConfiguration() {
        // Tutaj mogłoby być pobieranie danych z pliku konfiguracyjnego lub innego źródła
        // Na potrzeby przykładu, po prostu zwracamy wartość 42
        return 42;
    }

    public static void displayConfig() {
        System.out.println("Wartość konfiguracji: " + CONFIG_FEATURE);
    }
}