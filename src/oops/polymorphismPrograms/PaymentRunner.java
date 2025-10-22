package Polymorphism;
class Payment{
    public void makePayment(int amount){
  System.out.println("Making Payment"+amount);
    }

}

 class CreditCardPayment extends  Payment{
    public void makePayment(int amount){
        System.out.println("Making payment using card of amount is"+amount);
    }

}
class UpiPayment extends  Payment{
    public void makePayment(int amount){
        System.out.println("Making Payment "+amount);

    }
}
class NetBanking  extends  Payment{
    public void  makePayment (int amount){
        System.out.println("Making Payment"+amount);

    }
}
public class PaymentRunner {
    public static void main(String[] args){

        CreditCardPayment creditCardPayment=new CreditCardPayment();
        creditCardPayment.makePayment(1000);
        UpiPayment upiPayment=new UpiPayment();
        upiPayment.makePayment(1000);
    }
}
