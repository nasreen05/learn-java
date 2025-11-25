package basic.controlStatement.decisionMakingStatement;

public class NestedIfElse2 {
    public static void main(String[] args){
        int age=20;
        if(age>=20){
      System.out.println("you are eligible for withdrawal");
        int  amount=8000;
        int balance=700;
        if(amount<=balance){
            balance-=amount;
      System.out.println("successful withdraw"+balance);
      } else {
        System.out.println("UnSuccessful Withdraw");
}
    } else {
      System.out.println("Best luck for next time");
        }
    }
}


