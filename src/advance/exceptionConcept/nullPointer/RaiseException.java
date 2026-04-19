package advance.exceptionConcept.nullPointer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RaiseException {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the even number");
        int n= sc.nextInt();
        if(n%2==0)
            System.out.println(n+" is even");
        else
            throw  new InputMismatchException();
    }
}
