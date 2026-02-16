package basic.controlStatement.loopsConcept.whileLoopConcept;

import java.util.Scanner;

public class OddDigitReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ====== ");
        int n=sc.nextInt();
        while (n!=0){
            int last=n%10;
            if(n%2!=0)
                System.out.println(last);
            n=n/10;


        }
    }

}
