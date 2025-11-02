public class Motorcycle extends Vehicle {
    Motorcycle(String licensePlate) {
        super(licensePlate);
        vehicleSize = VehicleSize.SMALL;
    }
    double calculateParkingFee(int duration) {

        return vehicleSize.getSpace()*duration;
    }

    public String toString() {
        return "License plate: " + licensePlate+ " Vehicle Size: " + vehicleSize;
    }






}
