public class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Rower jedzie.");
    }

    @Override
    public void turnOnLights() {
        System.out.println("Włączone światła w rowerze.");
    }

    @Override
    public void move() {
        System.out.println("Rower jedzie");
    }
}
