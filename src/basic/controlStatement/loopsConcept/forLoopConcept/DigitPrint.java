package basic.controlStatement.loopsConcept.forLoopConcept;

import java.util.Scanner;

public class DigitPrint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter n Values ");
        for(int n=sc.nextInt();n!=0;n/=10){
            int last=n%10;
            System.out.println(last);
        }
    }
}
