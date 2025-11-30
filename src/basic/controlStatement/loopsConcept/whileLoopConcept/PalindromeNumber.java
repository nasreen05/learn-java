package basic.controlStatement.loopsConcept.whileLoopConcept;

public class PalindromeNumber {
    public static void main(String[] args){
       int num=121;
       int ab=num;
       int rem, sum=0;
       while(ab>0){
           rem=ab%10;
           sum=10*sum+rem;
           ab=ab/10;

       }
       if(sum==num){
      System.out.println("Palindrome");
       }else{
      System.out.println("not a Palindrome");
       }
    }
}
