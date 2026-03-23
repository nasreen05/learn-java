package oops.encapsulation;

public class Flipkart {
        private String userName;
        private long mobileNo;
        private int noOfOrder;
        private int noOfCustomer;

        // Constructor
        public Flipkart(String userName, long mobileNo, int noOfOrder, int noOfCustomer) {
            this.userName = userName;
            this.mobileNo = mobileNo;
            this.noOfOrder = noOfOrder;
            this.noOfCustomer = noOfCustomer;
        }

        // Getters
        public String getUserName() {
            return userName;
        }

        public long getMobileNo() {
            return mobileNo;
        }

        public int getNoOfOrder() {
            return noOfOrder;
        }

        public int getNoOfCustomer() {
            return noOfCustomer;
        }

        // Setters
        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setMobileNo(long mobileNo) {
            this.mobileNo = mobileNo;
        }

        public void setNoOfOrder(int noOfOrder) {
            this.noOfOrder = noOfOrder;
        }

        public void setNoOfCustomer(int noOfCustomer) {
            this.noOfCustomer = noOfCustomer;
        }
    }
