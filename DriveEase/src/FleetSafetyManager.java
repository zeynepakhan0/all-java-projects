public class FleetSafetyManager implements SecurityProtocol{
    public boolean checkAccess(Customer customer, Car car){

        if(customer.getAge()>=18 && customer.hasValidLicense() && car.getKmAge()<100000){
            return true;
        }
        return false;
    }
}
