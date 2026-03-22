package oops.encapsulation;

public class ATMTest {
       public static void main(String[] args) {

            ATM a = new ATM(123456789012L, 1234, "12/28");

            System.out.println("ATM Number: " + a.getAtmNo());
            System.out.println("PIN: " + a.getPin());
            System.out.println("Valid Date: " + a.getValidDate());

            // Updating values
            a.setPin(5678);
            a.setValidDate("01/30");

            System.out.println("Updated PIN: " + a.getPin());
            System.out.println("Updated Valid Date: " + a.getValidDate());
        }
    }

