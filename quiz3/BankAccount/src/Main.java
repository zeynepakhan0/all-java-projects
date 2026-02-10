public class Main {

    public static void main(String[] args) {


    BankAccount b1=new BankAccount(1,"Zeynep",500);
    BankAccount b2=new BankAccount(2,"Ali",700);
    BankAccount b3=new BankAccount(3,"Ceylin",900);

        try {
            b1.deposit(100);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }


        try {
            b2.withdraw(50);
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds Exception");
        } catch (NegativeAmountException e) {
            System.out.println("Negative Amount Exception");
        }


        try {
            b3.transfer(b1,100);
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds Exception");
        } catch (NegativeAmountException e) {
            System.out.println("Negative Amount Exception");
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }

        try{
            b2.transfer(b3,100);
        }
        catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds Exception");

        } catch (NegativeAmountException e) {
            System.out.println("Negative Amount Exception");
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}
