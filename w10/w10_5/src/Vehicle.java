public interface Vehicle {
    // Metoda abstrakcyjna
    void drive();

    // Metoda domyślna
    default void turnOnLights() {
        System.out.println("Światła włączone.");
    }

    // Metoda statyczna
    static void horn() {
        System.out.println("Trąbienie!");
    }

    void move();
}
