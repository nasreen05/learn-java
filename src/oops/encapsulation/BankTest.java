package oops.encapsulation;

public class BankTest {
      public static void main(String[] args) {

            Bank b = new Bank(1234567890L, "SBIN0001234", 50000.0, "Hyderabad");

            System.out.println("Account Number: " + b.getAccNo());
            System.out.println("IFSC Code: " + b.ifsc);
            System.out.println("Balance: " + b.getBalance());
            System.out.println("Branch: " + b.getBranch());

            // Updating values
            b.setBalance(75000.0);
            b.setBranch("Bangalore");

            System.out.println("Updated Balance: " + b.getBalance());
            System.out.println("Updated Branch: " + b.getBranch());
        }
    }

