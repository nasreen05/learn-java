package oops.encapsulation;

public class Bank {
        private long accNo;
        public String ifsc;
        private double balance;
        private String branch;

        // Constructor
        public Bank(long accNo, String ifsc, double balance, String branch) {
            this.accNo = accNo;
            this.ifsc = ifsc;
            this.balance = balance;
            this.branch = branch;
        }

        // Getters
        public long getAccNo() {
            return accNo;
        }

        public double getBalance() {
            return balance;
        }

        public String getBranch() {
            return branch;
        }

        // Setters
        public void setAccNo(long accNo) {
            this.accNo = accNo;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setBranch(String branch) {
            this.branch = branch;
        }
    }
