public class Truck extends Vehicle {
    Truck(String licensePlate) {
        super(licensePlate);
        vehicleSize = VehicleSize.LARGE;
    }
    double calculateParkingFee(int duration) {

        return vehicleSize.getSpace()*duration;
    }

    public String toString() {
        return "License plate: " + licensePlate+ " Vehicle Size: " + vehicleSize;
    }
}
