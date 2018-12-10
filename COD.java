public class COD extends BankAccount {
   private int expiry;

    public COD(String acctNumber, double balance, int expiry) {
        super(acctNumber, balance);
        this.expiry = expiry;
    }

    public int getExpiry() {
        return expiry;
    }

    public void setExpiry(int expiry) {
        this.expiry = expiry;
    }
}
