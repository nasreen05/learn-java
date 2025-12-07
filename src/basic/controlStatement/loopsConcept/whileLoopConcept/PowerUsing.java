package basic.controlStatement.loopsConcept.whileLoopConcept;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PowerUsing {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();

     int result=1;
     while(b>0){
         result=result*a;
         b--;
     }
        System.out.print("power"+result);
    }
}
