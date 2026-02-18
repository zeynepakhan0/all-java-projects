
public class Week3 {
    public static void main(String[] args) {

        Customer customer = new Customer("C-001", "Aybuke Kececi", MembershipLevel.GOLD);
        Order order = new Order(customer);

        order.addItem(new CoffeeItem("Latte", 4.00, CoffeeSize.LARGE, MilkType.OAT, true));
        order.addItem(new SandwichItem("Chicken Sand", 6.50, BreadType.SOURDOUGH, true, true));
        order.addItem(new CakeSliceItem("Cake Slice", 3.80, false, CakeFlavor.CHEESECAKE));

        System.out.println("=== BEFORE PREPARED ===\n");
        System.out.println(order.summary());

        order.markAllPrepared();

        System.out.println("=== AFTER PREPARED ===\n");
        System.out.println(order.summary());
    }
}