public class SandwichItem extends CafeItem {
    private final BreadType breadType;
    private final boolean addCheese;
    private final boolean toasted;

    public BreadType getBreadType() {
        return breadType;
    }

    public boolean isAddCheese() {
        return addCheese;
    }


    public boolean isToasted() {
        return toasted;
    }

    public SandwichItem(String name, double basePrice, BreadType breadType, boolean addCheese, boolean toasted) {
        super(name, basePrice);
        this.breadType = breadType;
        this.addCheese = false;
        this.toasted = false;
    }
    public double calculatePrice(){
        double price = basePrice + (breadType == BreadType.SOURDOUGH ? 0.60 : 0) +
                (addCheese ? 0.90 : 0) + (toasted ? 0.20 : 0);
        return price;
    }



}
