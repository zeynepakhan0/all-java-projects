public class Car extends Vehicle {

    private int numberOfDoors;
    private boolean isElectric;

    public Car(int id, String brand, String model, double price,int year, int numberOfDoors, boolean isElectric) {
        super(id, brand, model, price, year);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public boolean isElectric() {
        return isElectric;
    }

    public double calculateMaintenanceCost(){
        if(isElectric()){
            return getPrice()*(0.05);
        }
        return getPrice()*(0.1);
    }
    /*
    public double calculateMaintenanceCost() {
    double costRate;

    if (isElectric) {
        costRate = 0.05;
    } else {
        costRate = 0.1;
    }
    return getPrice() * costRate;
} */

    public String toString() {
        return super.toString()+ " Number of doors: "+numberOfDoors+ "Is an electric car?:"+isElectric;
    }





}
