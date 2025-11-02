public class Drink extends BaseMenuItem{
    boolean isAlcoholic;
    String cuisine;
    double price;
    String category;

    public Drink(String name, String cuisine, double price,boolean isAlcoholic, String category) {
        super(name);
        this.cuisine = cuisine;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
        this.category=category;
    }
    public double getPrice(){
        return price;
    }

    public String getCategory(){
        return category;
    }
    public void display() {
        System.out.println("Cuisine: "+ cuisine + " Price: "+ price + " Category: "+ category + "Is Alcoholic?: "+ isAlcoholic);
    }

}
