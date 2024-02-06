public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volga", 4);
        Car car2 = new Car("Toyota", 4);
        Truck truck = new Truck("Kamaz", 6);
        Truck truck2 = new Truck("Man", 8);
        Bicycle bicycle = new Bicycle("Marin", 2);
        Bicycle bicycle2 = new Bicycle("Welt", 2);

        TransportService[] transports = {
                car,
                car2,
                truck,
                truck2,
                bicycle,
                bicycle2
        };
        ServiceStation serviceStation = new ServiceStation();
        for (TransportService transport : transports) {
            serviceStation.chek(transport);
        }


    }
}