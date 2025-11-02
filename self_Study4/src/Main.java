public class Main {
    public static void main(String[] args) {

        Car car1=new Car(2,"Audi ","A4 ",50000,2020,4, false);
        Car car2=new Car(1,"Mazda ","6 ",60000,2022,4, true);
        Motorcycle motorcycle1=new Motorcycle(3,"Mercedes", "IDK", 10000,2010,600);
        Motorcycle motorcycle2=new Motorcycle(4,"Hyundai", "IDK2", 13000,2015,900);
        Galery gallery=new Galery();
        gallery.addVehicle(car1);
        gallery.addVehicle(car2);
        gallery.addVehicle(motorcycle1);
        gallery.addVehicle(motorcycle2);
        System.out.println("The vehicle is found:"+ gallery.searchByBrand("Mercedes"));
        System.out.println("The vehicle is found:"+ gallery.searchByBrand("Hyundai"));
        System.out.println("Total cost is:" +gallery.calculateTotalMaintenanceCost());
        gallery.listVehicles();

    }
}
