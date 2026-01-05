package InterfaceTask;
    public class ICICI implements RBI {

        String name;
        String address;
        int accountNumber;

        public ICICI() {
        }

        public ICICI(String name, String address,int accountNumber) {
            this.name= name;
            this.address= address;
            this.accountNumber= accountNumber;
        }

        @Override
        public String openAccount(String name, String address, int accountNumber) {
            // TODO Auto-generated method
            ICICI icici = new ICICI(name, address, accountNumber);
            return icici.getName();
        }

        @Override
        public double getRateOfInterest() {
            // TODO Auto-generated method stub
            return 7.0f;
        }

        @Override
        public String deposit(int amount) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public int withdraw(int amount) {
            // TODO Auto-generated method stub
            return 0;
        }

        public String getName() {
            return name;
        }
    }

