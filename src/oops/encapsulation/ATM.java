package oops.encapsulation;

public class ATM {
       private long atmNo;
        private int pin;
        private String validDate;

        // Constructor
        public ATM(long atmNo, int pin, String validDate) {
            this.atmNo = atmNo;
            this.pin = pin;
            this.validDate = validDate;
        }

        // Getters
        public long getAtmNo() {
            return atmNo;
        }

        public int getPin() {
            return pin;
        }

        public String getValidDate() {
            return validDate;
        }

        // Setters
        public void setAtmNo(long atmNo) {
            this.atmNo = atmNo;
        }

        public void setPin(int pin) {
            this.pin = pin;
        }

        public void setValidDate(String validDate) {
            this.validDate = validDate;
        }
    }

