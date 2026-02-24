import java.util.List;

public class Main {
    private static int counter=0;
    public int counter(){
        counter++;
        return counter;
    }
    public void processRental(Customer customer,Car car,SecurityProtocol protocol1, LoyaltyProcessor processor, List<CostFactor> addOns, int days){

        System.out.println("---Rental Request "+ counter());
        String service="";

        if(!protocol1.checkAccess(customer, car)){
            System.out.println("Rental DENIED for "+customer.getName()+": Insufficient credentials/car");
            return;
        }
        else {
            System.out.println(customer.getName()+ " is approved to rent the car "+ car.getPlate()+ "("+ car.getKmAge()+ "kms)");
            double baseRentalPriceBefore = days * 1000;
            double baseRentalPriceAfter = 0;
            for (CostFactor costFactor : addOns) {
                baseRentalPriceAfter=baseRentalPriceBefore+ costFactor.calculate(days);
                service= costFactor.getServiceDetail();
            }
            double pointsBefore = customer.getPoints();
            processor.updateRewards(customer, baseRentalPriceAfter);

            System.out.println("Total price for " + days + " days is: " + baseRentalPriceBefore);
            System.out.println("+ Service:" +service +"| Cost for this additional insurance for " + days + " days: " + (baseRentalPriceAfter - baseRentalPriceBefore));
            System.out.println("Loyalty Update: " + (customer.getPoints() - pointsBefore) + " points added to account.");
            System.out.println("Rental SUCCESS for " + customer.getName() + ". Total: " + baseRentalPriceAfter);
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Customer customer1= new Customer("Deniz",21,150,true);
        Customer customer2= new Customer("Zeynep",17,150,false);
        Car car1=new Car("1AZ65", 120000);
        Car car2=new Car("1BY87", 80000);
        SecurityProtocol safety=new FleetSafetyManager();
        LoyaltyProcessor bronzeLoyalty=new BronzeLoyaltyProgram();
        List<CostFactor> addOns=List.of(new PremiumInsurance());
        Main main=new Main();
        main.processRental(customer1,car2,safety, bronzeLoyalty, addOns,3);
        main.processRental(customer2,car1,safety, bronzeLoyalty, addOns,3);









    }
}
