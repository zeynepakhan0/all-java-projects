public class Customer {
    private final String customerID;
    private final String fullName;
    private final MembershipLevel membershipLevel;

    public String getCustomerID() {
        return customerID;
    }

    public String getFullName() {
        return fullName;
    }

    public MembershipLevel getMembershipLevel() {
        return membershipLevel;
    }


    public Customer(String customerID, String fullName, MembershipLevel membershipLevel) {
        this.customerID = customerID;
        this.fullName = fullName;
        this.membershipLevel = membershipLevel==null ? MembershipLevel.REGULAR : membershipLevel;
    }
}
