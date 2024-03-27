package ch08.sec11;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            ((Bus) vehicle).checkFare();
        }
        vehicle.run();
    }
}
