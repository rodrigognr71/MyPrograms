public class  Checking extends BankAccount {
    private double limit;

    public Checking(String acctNumber, double balance, double limit) {
        super(acctNumber, balance);
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
