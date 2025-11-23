package oops.technicalPrograms;

public class PalindromePro {
    public static void main(String[] args){
        int a=121;
        int b=a;
        int r, sum=0;
        while(b>0){
            r=b%10;
            sum=10*sum+r;
            b=b/10;

        }
        if(sum==a){
      System.out.println("Palindrome");

    }else{
      System.out.println("Not a Palindrome");
        }
    }
}
