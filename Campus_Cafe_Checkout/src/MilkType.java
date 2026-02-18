public enum MilkType {
    NONE(0.0), WHOLE(0.30), SKIM(0.25), OAT(0.60), ALMOND(0.60);
    private final double extraCost;
    MilkType(double extraCost){
        this.extraCost = extraCost;
    }
    public double getExtraCost(){
        return extraCost;
    }
}
