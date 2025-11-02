public class BankAccount {

    int accountID;
    String holderName;
    double balance;

    BankAccount(int accountID, String holderName, double balance) {
        this.accountID = accountID;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws NegativeAmountException{

        balance+=amount;
        if(amount<=0){
            throw new NegativeAmountException();
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException{

        balance-=amount;
        if(amount>balance){
            throw new InsufficientFundsException();
        }
        if(amount<=0){
            throw new NegativeAmountException();
        }
    }

    public void transfer(BankAccount target, double amount) throws InsufficientFundsException,
            NegativeAmountException, NullPointerException{

        balance-=amount;
        target.balance+=amount;
        if(amount<=0){
            throw new NegativeAmountException();
        }
        if(amount>balance){
            throw new InsufficientFundsException();
        }
        if(target==null){
            throw new NullPointerException();
        }

    }

    public String toString(){
        return "Account ID: "+accountID+", Holder Name: "+holderName+", Balance: "+balance;
    }

}
