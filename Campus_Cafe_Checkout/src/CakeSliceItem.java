public class CakeSliceItem extends CafeItem{

    private boolean glutenFree;
    private CakeFlavor flavor;

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public CakeFlavor getFlavor() {
        return flavor;
    }

    public CakeSliceItem(String name, double basePrice, boolean glutenFree, CakeFlavor cakeFlavor) {
        super(name, basePrice);
        this.glutenFree = false;
        this.flavor = cakeFlavor;
    }


    public double calculatePrice(){
        double price = basePrice + (glutenFree ? 0.70 : 0) + (flavor == CakeFlavor.CHEESECAKE ? 0.40 : 0);
        return price;
    }
}
