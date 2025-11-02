package Lab6;

public class Truck extends Vehicle{
    public Truck(String licensePlate) {
        super(licensePlate);
        setVehicleSize(VehicleSize.LARGE);
    }

    @Override
    public int calculateParkingFee(int duration) {
        return getVehicleSize().toParkingFee()*duration;
    }

    public String toString(){
        return "Truck{" + getLicensePlate() + "}";
    }
}
