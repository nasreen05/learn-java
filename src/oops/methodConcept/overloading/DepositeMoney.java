package oops.methodConcept.overloading;

public class DepositeMoney {
    static void  money(int Deposite){
        int result=Deposite;
        System.out.println("Deposite ="+result);
    }
    static void money(int Deposite, int withdraw){
        int result=withdraw;
        System.out.println("WithDraw ="+result);
    }
    static void money(int Deposite , int withdraw, int totalMoney){
        int result=totalMoney;
        System.out.println("Total Money =" +result);
    }
}
class DepositeRunner{
    public static void main(String[] args) {
        DepositeMoney.money(300000);
        DepositeMoney.money(300000,50000);
        DepositeMoney.money(300000,50000,15000000);
    }
}
