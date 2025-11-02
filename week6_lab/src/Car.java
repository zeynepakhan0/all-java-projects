public class Car extends Vehicle{
    Car(String licensePlate) {
        super(licensePlate);
        vehicleSize = VehicleSize.MEDIUM;
        //setVehicleSize(VehicleSize.MEDIUM); //vehicleSize private olsaydı
    }
    double calculateParkingFee(int duration) {

        return getVehicleSize().getSpace()*duration;
    }

    public String toString() {
        return "License plate: " + licensePlate+ " Vehicle Size: " + vehicleSize;
    }
}
