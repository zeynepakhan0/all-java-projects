public class Store {

    String name;
    Product[] products;
    int currentProductCount;
    int maxProductCount;

    Store(String name, int maxProductCount) {

     this.name=name;
     this.maxProductCount=maxProductCount;
     this.currentProductCount=0;
     this.products= new Product[maxProductCount];
 }

 public void addProduct(Product product){

        if(currentProductCount<maxProductCount){

            products[currentProductCount]=product;
            currentProductCount++;
        }
 }

 public void displayProducts(){
        for(int i=0; i<currentProductCount; i++){
            System.out.println(products[i]);
        }
 }

public int getTotalInventoryValue(){
        double total=0;
        for(int i=0; i<currentProductCount; i++){
            total+= (products[i].price)*(products[i].quantity);
        }
        return total;
}
public static void main(String args[]){

        Store str=new Store("Zeynep's Store",100);
        Product product2= new Product(2,"Toothbrush","Hygiene",100,20);
        Product product3=new Product(3,"Tampons","Hygiene",100,20);
        Product product4=new Product(4,"Deetergent","Hygiene",120,20);
        str.addProduct(product2);
        str.addProduct(product3);
        str.addProduct(product4);
        str.displayProducts();
        System.out.println("Total inventroy in the store is: " +str.getTotalInventoryValue());


}

}
