package InterfaceTask;


public class Account {
    String name;
    String address;
    int accountNumber;
    int balance;

    public Account() {}

    public Account(String name, String address, int accountNumber) {
        // TODO Auto-generated constructor stub
        this.name=name;
        this.address=address;
        this.accountNumber=accountNumber;
    }

    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) { //no return type is user here
        this.address=address;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        // TODO Auto-generated method stub
        return balance;
    }

    public void setBalance(int balance) {
        // TODO Auto-generated method stub
        this.balance = balance;

    }

    //private static void addBank(SBI sbi2) {
    // TODO Auto-generated method stub

    //}

//	private static int getBalanceByAccountName(String string) {
    // TODO Auto-generated method stub
//		return 0;
    //}

}