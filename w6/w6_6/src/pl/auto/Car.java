package pl.auto;

// Klasa pochodna
public class Car extends Vehicle {
    @Override
    public void display() {

        System.out.println("To jest samochód.");
        super.display();  // Wywołanie metody z klasy bazowej
    }
}