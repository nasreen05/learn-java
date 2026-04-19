package advance.exceptionConcept.userDefineExce;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int pin=987439;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your upi pin");
           int upiPin= sc.nextInt();
           if(pin==upiPin)
               System.out.println("pin is valid");
           else
               throw  new InputMismatchException("pin is invalid");

        }
    }

