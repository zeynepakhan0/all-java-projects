public class Test {
    public static void main(String[] args) {
        Vehicle motorcycle=new Motorcycle("Motorcycle");
        Vehicle car=new Car("Car");
        Vehicle truck=new Truck("Truck");

        CarPark carPark = new CarPark(10);

        carPark.parkVehicle(motorcycle);
        carPark.parkVehicle(car);
        carPark.parkVehicle(truck);

        System.out.println(carPark);

        carPark.releaseVehicle(motorcycle,2);
        carPark.releaseVehicle(car,1);
        carPark.releaseVehicle(truck,3);

        System.out.println(carPark);


    }
}
