public class Food extends BaseMenuItem{
    String cuisine;
    double price;
    String category;

    Food(String name, String cuisine, double price, String category) {
        super(name);
        this.cuisine = cuisine;
        this.price = price;
        this.category=category;
    }

    public double getPrice(){
        return price;
    }
    public void display(){
        System.out.println("Cuisine: "+ cuisine + " Category: "+ category + " Price: "+ price);
    }
    public String getCategory(){
        return category;
    }
}
