public class PremiumInsurance implements CostFactor {

    public double calculate (int duration){

        return duration*250;
    }

    @Override
    public String getServiceDetail() {
        return "Premium Insurance";
    }
}

