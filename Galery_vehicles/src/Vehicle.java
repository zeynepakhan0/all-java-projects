public abstract class Vehicle {

int id;
String brand;
String model;
double price;
int year;

public Vehicle(int id, String brand, String model, double price, int year) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.year = year;
}

    public int getId() {
        return id;
    }
    public String getBrand() {
    return brand;
    }
    public String getModel() {
    return model;
    }
    public double getPrice() {
    return price;
    }
    public int getYear() {
    return year;
    }

    public abstract double calculateMaintenanceCost();

    public String toString() {
        return "id:"+id+ " brand:"+brand+ " model:"+model+ " price:"+price+ " year:"+year;
    }






}
