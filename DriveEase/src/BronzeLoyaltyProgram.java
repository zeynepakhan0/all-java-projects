public class BronzeLoyaltyProgram implements LoyaltyProcessor  {

    public void updateRewards(Customer customer, double amount){

        double newAmount= (amount*3)/100;
        customer.setPoints(customer.getPoints()+newAmount);

    }
}
