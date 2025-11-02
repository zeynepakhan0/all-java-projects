public class Product {

    int id;
    String name;
    String category;
    double price;
    int quantity;

Product(int id,String name, String category, double price, int quantity) {
    this.id=id;
    this.name=name;
    this.category=category;
    this.price=price;
    this.quantity=quantity;
}

public String toString(){

    return "id:" +id + "\n" + "name:" +name + "\n" + "category:" +category + "\n" + "price:" +price+ "\n" + "quantity:" +quantity;
}

public static void main(String[] args) {

    Product product1= new Product(1,"Soap", "Hygiene", 50,20);
    System.out.println(product1);


}



}
