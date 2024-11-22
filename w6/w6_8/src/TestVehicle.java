public class TestVehicle {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);

        myCar.displayBrand();  // Dziedziczone z klasy Vehicle
        myCar.displayDoors();  // Specyficzne dla klasy Car
        myCar.drive();         // Przesłonięta z klasy Vehicle
    }
}

class Vehicle {
    private String brand;

    // Konstruktor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Metoda do wyświetlania informacji o marce
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    // Metoda do symulacji jazdy
    public void drive() {
        System.out.println("This vehicle is driving.");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    // Konstruktor
    public Car(String brand, int numberOfDoors) {
        super(brand); // Wywołanie konstruktora klasy bazowej
        this.numberOfDoors = numberOfDoors;
    }

    // Metoda do wyświetlania liczby drzwi
    public void displayDoors() {
        System.out.println("Number of doors: " + numberOfDoors);
    }

    // Przesłonięcie metody drive
    @Override
    public void drive() {
        System.out.println("The car is driving smoothly.");
    }
}