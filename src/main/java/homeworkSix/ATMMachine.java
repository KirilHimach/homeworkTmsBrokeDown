package homeworkSix;

public class ATMMachine {
    private int twentyBill;
    private int fiftyBill;
    private int oneHundredBill;

    static {
        System.out.println("The ATM machine has only 20, 50 and 100 bills!");
    }
    public ATMMachine(int twentyBill, int fiftyBill, int oneHundredBill) {
        this.twentyBill = twentyBill;
        this.fiftyBill = fiftyBill;
        this.oneHundredBill = oneHundredBill;
    }

    public void addCash(int twentyBill, int fiftyBill, int oneHundredBill) {
        this.twentyBill += twentyBill * 20;
        this.fiftyBill += fiftyBill * 50;
        this.oneHundredBill += oneHundredBill * 100;
    }

    public boolean withdrawCash(int cash) {
        if ((cash % 100) == 0 && (this.oneHundredBill - cash) >= 0) {
            System.out.printf("You have received %d bills.", cash / 100);
            this.oneHundredBill -= cash;
        }
        return true;
    }
}
