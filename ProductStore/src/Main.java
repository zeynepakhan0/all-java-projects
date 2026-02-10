import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ElectronicProduct product = new ElectronicProduct("Xiaomi", "14T", 2, 1, "14T", 10000, "Mobile phone");
        ElectronicProduct product2 = new ElectronicProduct("Apple", "14", 2, 2, "Iphone", 20000, "Mobile phone");
        BookProduct product3 = new BookProduct(3, "Book", 100, "book", "Fyodor Dostoyevski", "Classical", 500);
        BookProduct product4 = new BookProduct(4, "Thus Spoke Zaarthustra", 150, "Book", "friedrich Nietzsche", "Philosophy", 400);
        Store store = new Store();
        store.addProduct(product);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);
        System.out.println(store);


    }
}
