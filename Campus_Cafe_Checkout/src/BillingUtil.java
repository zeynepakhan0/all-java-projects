public final class BillingUtil {
    public static final double TAX_RATE=0.08;

    private BillingUtil() {

    }
    public static double discountRate(MembershipLevel level){

        return switch(level){
            case REGULAR -> 0.00;
            case SILVER -> 0.05;
            case GOLD -> 0.10;
        };
    }

    public static double discountAmount(double subtotal,MembershipLevel level){

        return (subtotal * discountRate(level));
    }

    public static double tax(double discountedSubtotal){
        return (discountedSubtotal * TAX_RATE);
    }

    public static double grandTotal(double subTotal, MembershipLevel level){

        double discount=discountAmount(subTotal,level);
        double discounted=Math.round(subTotal-discount);
        double tax=tax(discounted);

        return Math.round(discounted+tax);
    }


}
