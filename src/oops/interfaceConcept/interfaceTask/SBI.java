package InterfaceTask;
public class SBI implements RBI{

    //String name;
    //String address;
    //int accountNumber;
    //int balance;

    Account account;

    public SBI() {}

    public SBI(String name, String address, int accountNumber) {
        //this.name = name;
        //this.address = address;
        //this.accountNumber = accountNumber;

        this.account = new Account(name, address, accountNumber);
    }
    @Override
    public String openAccount(String name, String address, int accountNumber) {
        // TODO Auto-generated method stub
        //SBI sbi = new SBI(name, address, accountNumber);
        this.account = new Account(name, address, accountNumber);
        return this.account.getName();
    }
    @Override
    public double getRateOfInterest() {
        // TODO Auto-generated method stub
        return 6.5d;
    }
    @Override
    public String deposit(int amount) {
        // TODO Auto-generated method stub
        //balance = balance + amount;
        account.setBalance(account.getBalance() + amount);
        return "Deposited" + amount + "Successfully";
    }
    @Override
    public int withdraw(int amount) {
        // TODO Auto-generated method stub
        //if (balance > 0) {
        //balance = balance - amount;
        //}
        if (account.getBalance() > 0) {
            account.setBalance(account.getBalance() - amount);
        }
        return amount;
    }

    public String getName() {
        return account.getName();
    }
}