package Account;
 class AccountRunner {

         public static void main(String[] args) {



                     PersonalAccount personal = new PersonalAccount();
                     personal.setAccountNumber(101);
                     personal.setHolderName("Reshma");
                     personal.setBalance(5000);

                     System.out.println("---- Personal Account ----");
                     System.out.println("Account No: " + personal.getAccountNumber());
                     System.out.println("Holder: " + personal.getHolderName());
                     System.out.println("Balance: " + personal.getBalance());

                     System.out.println();


                     CurrentAccount current = new CurrentAccount();
                     current.setAccountNumber(202);
                     current.setHolderName("Nasreen");
                     current.setBalance(10000);

                     System.out.println("---- Current Account ----");
                     System.out.println("Account No: " + current.getAccountNumber());
                     System.out.println("Holder: " + current.getHolderName());
                     System.out.println("Balance: " + current.getBalance());

                     System.out.println();


                     PersonalAccount personal1 = new PersonalAccount();
                     personal1.setAccountNumber(103);
                     personal1.setHolderName("Neha");
                     personal1.setBalance(7000);

                     System.out.println("---- Personal Account (2) ----");
                     System.out.println("Account No: " + personal1.getAccountNumber());
                     System.out.println("Holder: " + personal1.getHolderName());
                     System.out.println("Balance: " + personal1.getBalance());

                     System.out.println();


                     CurrentAccount current1 = new CurrentAccount();
                     current1.setAccountNumber(204);
                     current1.setHolderName("Sneha");
                     current1.setBalance(15000);

                     System.out.println("---- Current Account (2) ----");
                     System.out.println("Account No: " + current1.getAccountNumber());
                     System.out.println("Holder: " + current1.getHolderName());
                     System.out.println("Balance: " + current1.getBalance());
                 }
             }
