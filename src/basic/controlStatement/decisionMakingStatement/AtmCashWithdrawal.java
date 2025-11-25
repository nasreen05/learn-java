package basic.controlStatement.decisionMakingStatement;

public class AtmCashWithdrawal {
    public static void main(String[] args){
        int  mypin=1234;
        int urpin=1234;
        int amount=3000;
        int balance=5000;
        boolean  otpEntered=true;
        if(mypin==urpin){

            if(amount %100==0){
                if(amount>=balance){
                    if(amount>1000){
                        if(otpEntered){
              System.out.println("withdraw successful");
                        }else{
              System.out.println("OTP verification failed ");
              }
                        }else{
System.out.println("withdraw successful");
}
                    }else{
                    System.out.println("Amount must be multiple of 100!");
                        }
                }else{
                System.out.println("Incorrect PIN");
                    }
                }
            }}
