import homeworkSix.ATMMachine;
import homeworkSix.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("QWERTY453", 1250);
        CreditCard card2 = new CreditCard("PORT777", 999);
        CreditCard card3 = new CreditCard("BOND007", 1);
        card1.addAccountAmount(300);
        card2.addAccountAmount(1_000_000);
        card3.withdrawAccountAmount(555);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println();
        System.out.println();

        ATMMachine machine = new ATMMachine(5, 5, 6);
        machine.addCash(22, 12, 6);


    }
}
