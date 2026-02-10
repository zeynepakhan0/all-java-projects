import java.util.ArrayList;

public class Store {
    public ArrayList<Product> inventory;

    public Store() {
        inventory = new ArrayList<>();
    }

public void addProduct(Product product){
        inventory.add(product);
}

public void removeProduct(Product product){
        inventory.remove(product);
}

public ArrayList<Product> searchProduct(String name){
       ArrayList<Product> products = new ArrayList<>();
       for(int i = 0; i < inventory.size(); i++){
           Product product = inventory.get(i);
           if(product.getName().equals(name)){
               products.add(product);
           }
       }
       return products;
}

public double calculateTotalValue(){
    double total=0;
    for(int i = 0; i < inventory.size(); i++){
        total+=inventory.get(i).getPrice()+ inventory.get(i).getTax();
    }
    return total;
}

public String toString() {

        String result= "";
        for(int i = 0; i < inventory.size(); i++){
            result+=inventory.get(i);
        }
    return super.toString() + "inventory:" +result;

}
}
