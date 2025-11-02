import java.util.ArrayList;

public class CarPark {
    ArrayList<Vehicle> parkedVehicles;
    int capacity;
    int totalEarnings;

    CarPark(int capacity) {
        parkedVehicles = new ArrayList<>();
        this.capacity = capacity;
        this.totalEarnings = 0;
    }

    //Implement parkVehicle method, should check for available space that fit the
    //vehicle size and park the vehicle accordingly.


    public void parkVehicle(Vehicle vehicle) {
        int requiredSpace=vehicle.getVehicleSize().getSpace();
        if(requiredSpace<=capacity) {
            parkedVehicles.add(vehicle);
            capacity -= requiredSpace;
            System.out.println("Vehicle parked successfully");
        }else{
            System.out.println("Vehicle exceeded capacity");
        }
    }


    public void releaseVehicle(Vehicle vehicle,int duration){
        parkedVehicles.remove(vehicle);
        totalEarnings+=vehicle.calculateParkingFee(duration);
        capacity+=vehicle.getVehicleSize().getSpace();
    }

    public String toString(){
        String st="";
        for(Vehicle v : parkedVehicles){
            st+=v.toString()+"\n";
        }
        st+="Capacity: "+capacity+"totalEarnings: "+totalEarnings+"\n";
        return st;
    }
}
