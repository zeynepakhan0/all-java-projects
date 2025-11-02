import java.util.ArrayList;

public class Galery {
    private ArrayList<Vehicle> inventory;

    public Galery() {
        inventory = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getId() == id) {
                inventory.remove(i);
                break;
            }
        }
    }
/*
Iterator ile silme:
import java.util.Iterator;

public void removeVehicle(int id) {
    Iterator<Vehicle> iterator = inventory.iterator();
    while (iterator.hasNext()) {
        Vehicle v = iterator.next();
        if (v.getId() == id) {
            iterator.remove(); // güvenli bir şekilde siler
            break;
        }
    }
}

 */

    public ArrayList<Vehicle> searchByBrand(String brand) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getBrand().equals(brand)) {
                vehicles.add(inventory.get(i));
            }
        }
        return vehicles;
    }

    public double calculateTotalMaintenanceCost() {
        double total = 0;
        for (int i = 0; i < inventory.size(); i++) {
            total += inventory.get(i).calculateMaintenanceCost();
        }
        return total;
    }

    public void listVehicles() {
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }
    }

}