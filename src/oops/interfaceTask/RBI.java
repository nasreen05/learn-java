package InterfaceTask;

    public interface RBI {

        public abstract String openAccount(String name, String address, int accountNumber);

        public abstract double getRateOfInterest();

        public abstract String deposit(int amount);

        public abstract int withdraw(int amount);

        default void provideLoan(int amount) {

        }
    }