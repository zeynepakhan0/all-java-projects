public class CoffeeItem extends CafeItem{
    private final CoffeeSize size;
    private final boolean extraShot;
    private final MilkType MilkType;

    public MilkType getMilkType() {
        return MilkType;
    }

    public CoffeeSize getSize() {
        return size;
    }


    public boolean isExtraShot() {
        return extraShot;
    }


    public CoffeeItem( String name, double basePrice, CoffeeSize size, MilkType MilkType, boolean extraShot) {
        super(name, basePrice);
        this.MilkType = MilkType;
        this.size = size;
        this.extraShot = false;

    }


    public double calculatePrice(){
        double price = basePrice * size.getMultiplier() + MilkType.getExtraCost() + (extraShot ? 0.75 :0);
        return price;
    }
}
