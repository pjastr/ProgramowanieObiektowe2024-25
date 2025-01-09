public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Samochód jedzie.");
    }

    @Override
    public void move() {
        System.out.println("Samochód jedzie");
    }
}
