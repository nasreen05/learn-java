package Polymorphism;
class Account{
    public void showLoanDetails(int amount) {
        System.out.println("General Account Loan of amount: " + amount);
    }
}

class HomeloanAccount extends Account{
    public void showLoanDetails(int amount) {
        System.out.println("Home Loan sanctioned for amount: " + amount);
    }
}


class  VichalLoanAccount extends Account{
    public void showLoanDetails(int amount) {
        System.out.println("Vehicle Loan sanctioned for amount: " + amount);
    }
}
public class AccountRunner {
    public static void main(String[] args){
    HomeloanAccount acc1 = new HomeloanAccount();
        acc1.showLoanDetails(500000);

    VichalLoanAccount acc2 = new VichalLoanAccount();
        acc2.showLoanDetails(300000);
    }
}

