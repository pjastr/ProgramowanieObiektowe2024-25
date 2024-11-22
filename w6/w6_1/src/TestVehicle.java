public class TestVehicle{
    public static void main(String[] args) {
        //Vehicle car = new Vehicle("Bus");
        Vehicle truck = Vehicle.createTruck();

        //System.out.println(car.getType());
        System.out.println(truck.getType());
    }
}

class Vehicle {

    private String type;

    private Vehicle(String type) {
        this.type = type;
    }

    public static Vehicle createCar() {
        return new Vehicle("Car");
    }

    public static Vehicle createTruck() {
        return new Vehicle("Truck");
    }

    public String getType() {
        return type;
    }
}