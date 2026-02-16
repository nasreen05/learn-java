package basic.controlStatement.loopsConcept.forLoopConcept;

import java.util.Scanner;

public class EvenPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        for(int s=1,n=sc.nextInt();s<=n;s++){
            if(s%2==0)
                System.out.println(s);

        }
    }
}
