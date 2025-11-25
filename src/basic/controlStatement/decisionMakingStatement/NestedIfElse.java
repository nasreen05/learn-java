package basic.controlStatement.decisionMakingStatement;

public class NestedIfElse {
    public static void main(String[] args){
        int upin=1234;
        int  apin=1234;
        if(upin==apin){
      System.out.println("Allow for WithDrawl");

        int amount=9000;
        int balance =500;
        if(amount<=balance){
            balance-=amount;
      System.out.println("withdraw successful new amount"+balance);
        }else {
      System.out.println("withdraw unsuccessful , try later");
      }
        }else{
    System.out.println("thanks try again");
    }
        }
}

