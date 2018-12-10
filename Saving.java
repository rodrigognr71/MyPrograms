public class Saving extends BankAccount {
    private int transfer;

    public Saving(String acctNumber, double balance, int transfer) {
        super(acctNumber, balance);
        this.transfer = transfer;
    }
}
