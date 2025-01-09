import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.drive();
        Bike b1 = new Bike();
        b1.drive();
        Car car = new Car();

        car.drive(); // Wywołanie metody abstrakcyjnej
        car.turnOnLights(); // Wywołanie metody domyślnej

        Vehicle.horn(); // Wywołanie metody statycznej interfejsu

        ArrayList<Vehicle> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(b1);
        for (var elem : lista){
            elem.move();
        }
    }
}