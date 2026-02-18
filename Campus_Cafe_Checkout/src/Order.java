import java.util.ArrayList;

public class Order {
    private static int nextOrderNo=1;
    private final Customer customer;
    private final ArrayList<CafeItem> items;
    private final int orderNo;

    public Customer getCustomer() {
        return customer;
    }
    public int getOrderNo() {
        return orderNo;
    }

    public Order(Customer customer) {
        this.customer = customer;
        this.orderNo = nextOrderNo++;
        this.items = new ArrayList<>();

    }
    public void addItem(CafeItem item) {
        items.add(item);
    }
    public ArrayList<CafeItem> getItemsSnapshot() {
        return new ArrayList<>(items);
    }
    public double subTotal() {
        double sum=0.0;
        for(CafeItem item : items) {
            sum+=item.calculatePrice();
        }
        return (sum);
    }

    public double discountAmount() {
        return -BillingUtil.discountAmount(subTotal(),customer.getMembershipLevel());
    }

    public double discountSubTotal() {
        return subTotal()-BillingUtil.discountAmount(subTotal(),customer.getMembershipLevel());

    }
    public double grandTotal() {
       return discountSubTotal()+BillingUtil.tax(discountSubTotal());
    }
    public double tax(){
        return BillingUtil.tax(discountSubTotal());

    }

    public void markAllPrepared(){

        for(CafeItem item : items) {
            item.markPrepared();
        }
    }
    public String summary() {

        String word="";
        for(CafeItem item : items) {
            word+=item.receiptLine();
        }
        String text="Order" + getOrderNo() + "\n" +
                "Customer: " + customer.getFullName()+
                " Membership:" + customer.getMembershipLevel()+ "\n" +
                "Items:\n" + word + "\n" +
                "Subtotal:" + String.format("%.2f", subTotal())+"\n"+"Discount:"+String.format("%.2f", discountAmount())+"\n" +"Discounted Subtotal:"
        +String.format("%.2f", discountSubTotal())+ "\n"+
                "Tax("+ (int)(BillingUtil.TAX_RATE * 100) + "%):"+ String.format("%.2f", tax())+ "\n"+"Grand Total:" +String.format("%.2f", grandTotal())+
                "\n\n";

        return text;
    }


}
