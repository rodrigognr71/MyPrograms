public class BankAccount {
    private String acctNumber;
    private double balance;

    Checking checking = new Checking();
    Saving saving = new Saving();
    COD cod = new COD();

// Constructor/.
    public BankAccount(String acctNumber, double balance){
       this.acctNumber = acctNumber;
        this.balance = balance;
    }

    public String getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
