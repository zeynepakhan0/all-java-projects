public class Motorcycle extends Vehicle {

    private int engineCapacity;
public Motorcycle(int id, String brand, String model, double price, int year, int engineCapacity) {
    super(id, brand, model, price, year);
    this.engineCapacity = engineCapacity;
}
public int getEngineCapacity() {
    return engineCapacity;
}
 public double calculateMaintenanceCost(){

    if(getEngineCapacity()>800){
        return getPrice()*(0.12);
    }
    return getPrice()*(0.07);
 }
public String toString(){
    return super.toString() + "Engine capacity:" + engineCapacity;
}

}
