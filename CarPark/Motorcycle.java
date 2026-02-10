package Lab6;

public class Motorcycle extends Vehicle{
    public Motorcycle(String licensePlate) {
        super(licensePlate);
        setVehicleSize(VehicleSize.SMALL);
    }

    @Override
    public int calculateParkingFee(int duration) {
        return getVehicleSize().toParkingFee()*duration;
    }

    public String toString(){
        return "Motorcycle{" + getLicensePlate() + "}";
    }
}
