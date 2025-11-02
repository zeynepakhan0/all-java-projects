public abstract class Vehicle {

    String licensePlate;
    protected VehicleSize vehicleSize;
    Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    public VehicleSize getVehicleSize(){
        return vehicleSize;
    }

    abstract double calculateParkingFee(int duration);

    public enum VehicleSize {
        SMALL(1,1),MEDIUM(2,2),LARGE(3,3);
        int feePerHour;
        int space;

        VehicleSize(int space,int feePerHour){
            this.space=space;
            this.feePerHour=feePerHour;
        }

        public int getSpace(){
            return space;
        }
    }

}
