package Lab6;

import java.util.ArrayList;

public class CarPark {
    private ArrayList<Vehicle> parkedVehicles;
    private int capacity;
    private int totalEarned;

    public CarPark(int capacity) {
        parkedVehicles = new ArrayList<>();
        this.capacity = capacity;
        totalEarned = 0;
    }

    public void parkVehicle(Vehicle vehicle){
        int requiredSpace = vehicle.getVehicleSize().toSpace();
        if(capacity>=requiredSpace){
            parkedVehicles.add(vehicle);
            capacity -= requiredSpace;
            System.out.println("Vehicle Parked!");
        }
        else{
            System.out.println("Not enough space!");
        }
    }

    public void releaseVehicle(Vehicle vehicle, int duration){
        parkedVehicles.remove(vehicle);
        capacity += vehicle.getVehicleSize().toSpace();
        totalEarned += vehicle.calculateParkingFee(duration);
    }

    public String toString(){
        String st = "Parked Vehicles: \n";
        for (Vehicle vehicle:parkedVehicles){
            st += vehicle + "\n";
        }
        st += "Capacity:" + capacity + " Total Earned:" + totalEarned;
        return st;
    }
}
