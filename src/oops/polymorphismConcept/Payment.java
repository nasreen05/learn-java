package oops.polymorphismConcept;

public class Payment {
    public void pay(double cash){
        System.out.println("Payment success through cash");
    }
    public void pay(String upiId){
        System.out.println("Payment success through upiId");

    }
    public void pay( long cardNo , int pin){
        System.out.println("Paymeent success through card");
    }

    public static void main(String[] args) {
        Payment p= new Payment();
        p.pay("84732");
        p.pay("687987");
        p.pay(78243687468274l,7843);

    }
}
