import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Food food= new Food("Karnıyarık","Turk", 150,"Yemek");
        Food food2= new Food("Makarna","Italyan",200,"Yemek");
        Drink drink=new Drink("Gazoz","Amerikan",50,false, "Icecek");
        Drink drink2=new Drink("Sarap","Fransız",600,true,"Icecek");

        RestaurantMenu restaurantMenu=new RestaurantMenu();
        restaurantMenu.addMenuItem(food);
        restaurantMenu.addMenuItem(food2);
        restaurantMenu.addMenuItem(drink);
        restaurantMenu.addMenuItem(drink2);

        System.out.println("Total price:"+ restaurantMenu.calculateTotalPrice());
    restaurantMenu.removeMenuByCategory("Icecek");
    restaurantMenu.displayMenu();
    System.out.println();
    restaurantMenu.findMenuItemByCategory("Yemek");
    restaurantMenu.displayMenu();
    System.out.println("Total price:"+ restaurantMenu.calculateTotalPrice());






    }
}
