import java.util.ArrayList;

public class RestaurantMenu {
    ArrayList<MenuItem> menuItems;
    public RestaurantMenu() {
        menuItems = new ArrayList<>();
    }

    void displayMenu() {
        for(MenuItem menuItem : menuItems) {
            menuItem.display();
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for(int i=0;i<menuItems.size();i++) {
            MenuItem menuItem = menuItems.get(i);
            totalPrice+=menuItem.getPrice();
        }
        return totalPrice;
    }


    void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> findMenuItemByCategory(String category) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        for(int i=0;i<menuItems.size();i++) {
            MenuItem menuItem = menuItems.get(i);
            if(menuItem.getCategory().equals(category)) {
                menuItems.add(menuItem);
            }
        }
        return menuItems;
    }

    public void removeMenuByCategory(String category) {

        ArrayList<MenuItem> removedMenuItems=new ArrayList<>();
        for(int i=0;i<menuItems.size();i++) {
            MenuItem menuItem = menuItems.get(i);
            if(menuItem.getCategory().equals(category)) {
                removedMenuItems.add(menuItem);
            }
        }
        for(int i=0;i<removedMenuItems.size();i++) {
            MenuItem removedMenuItem = removedMenuItems.get(i);
            menuItems.remove(removedMenuItem);
        }

    }





}
