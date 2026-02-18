public abstract class CafeItem {
    private final int itemID;
    private static int nextID=2000;
    protected String name;
    protected double basePrice;
    private boolean prepared;

    public double getBasePrice() {
        return basePrice;
    }

    public int getItemID() {
        return itemID;
    }

    public String getName() {
        return name;
    }

    public static int getNextID() {
        return nextID;
    }

    public boolean isPrepared() {
        return prepared;
    }


    public CafeItem(String name, double basePrice){
        this.itemID = nextItemID();
        this.name = name;
        this.basePrice = basePrice;
        this.prepared = false;

    }
    public void markPrepared(){
        this.prepared = true;
    }


    public abstract double calculatePrice();

    private static int nextItemID(){
        return nextID++;
    }

    public String receiptLine(){
        return "#"+ itemID+" "+name + " => " +String.format("%.2f", calculatePrice())+" |Prepared: "+isPrepared()+"\n";
    }
}
