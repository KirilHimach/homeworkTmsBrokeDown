package homeworkSix;

public class CreditCard {
    private final String accountNumber;
    private int accountAmount;

    public CreditCard(String accountNumber, int accountAmount) {
        this.accountNumber = accountNumber;
        this.accountAmount = accountAmount;
    }

    public void addAccountAmount(int accountAmount) {
        this.accountAmount += accountAmount;
    }

  public void withdrawAccountAmount(int accountAmount) {
        this.accountAmount -= accountAmount;
  }

    @Override
    public String toString() {
        return "Your account number is " + accountNumber +
                ", your card balance = " + accountAmount + ';';
    }
}
