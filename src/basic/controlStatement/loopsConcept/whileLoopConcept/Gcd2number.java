package basic.controlStatement.loopsConcept.whileLoopConcept;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Gcd2number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("GCD: " + a);
        }
    }
