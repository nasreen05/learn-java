package basic.controlStatement.loopsConcept.forLoopConcept;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        for(int s=1,n=sc.nextInt();s<=n;s++){
            System.out.println(s);

        }
    }
}
