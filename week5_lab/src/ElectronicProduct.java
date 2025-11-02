public class ElectronicProduct extends Product {

private String manufacturer;
private String model;
private int warranty;

public ElectronicProduct(String manufacturer, String model, int warranty,int id, String name, double price, String description) {
    super(id, name, price, description);
    this.manufacturer = manufacturer;
    this.model = model;
    this.warranty = warranty;
}

public String getManufacturer() {
    return manufacturer;
}
public String getModel(){
    return model;
}
public int getWarranty(){
    return warranty;
}
public double getTax(){
    return getPrice()*0.2;
}

public String toString(){
    return super.toString()+ "manufacturer:" + manufacturer+ "model:" + model+ "warranty:" + warranty;
}

}
