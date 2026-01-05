package InterfaceTask;

public class RBIRunner {

        static SBI[] sbiArray = new SBI[10];

        static ICICI[] iciciArray = new ICICI[10];

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    RBI rbi = new SBI();
    rbi.openAccount("Raj", "BAngalore", 1);
    System.out.println(rbi.getRateOfInterest());
    if (rbi instanceof SBI) {
      SBI sbi1 = (SBI) rbi;
      System.out.println("NAme of account holder is " + sbi1.getName());
    }
    SBI sbi2 = new SBI();
    sbi2.openAccount("Suarj", "Mysore", 2);
    System.out.println(sbi2.getName());
    System.out.println(sbi2.getRateOfInterest());
    sbi2.deposit(1000);
    addBank(sbi2);
    int balance = getBalanceByAccountName("Suraj");

    //   System.out.println("Balance of Suraj account is " + balance);
    // depositeAmountByName("suraj",1000);
    // System.out.println(balance);
    // withdrawAmountbyName("suraj",500);
    //  balance =getBalanceByAccountName("suraj");
    // System.out.println(balance);

    System.out.println("suraj bank balance is " + balance);
  }

        static void addBank(SBI sbi2) {
            // TODO Auto-generated method stub

        }

        static int getBalanceByAccountName(String string) {
            // TODO Auto-generated method stub
            return 0;
        }



    }

