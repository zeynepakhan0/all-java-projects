package Lab6;

public class Car extends Vehicle{
    public Car(String licensePlate) {
        super(licensePlate);
        setVehicleSize(VehicleSize.MEDIUM);
    }

    @Override
    public int calculateParkingFee(int duration) {
        return getVehicleSize().toParkingFee()*duration;
    }

    public String toString(){
        return "Car{" + getLicensePlate() + "}";
    }
}
