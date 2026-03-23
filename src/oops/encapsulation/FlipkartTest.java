package oops.encapsulation;

public class FlipkartTest {
        public static void main(String[] args) {

            Flipkart f = new Flipkart("Neha", 9876543210L, 5, 100);

            System.out.println("User Name: " + f.getUserName());
            System.out.println("Mobile No: " + f.getMobileNo());
            System.out.println("No of Orders: " + f.getNoOfOrder());
            System.out.println("No of Customers: " + f.getNoOfCustomer());

            // Updating values
            f.setNoOfOrder(10);
            f.setNoOfCustomer(150);

            System.out.println("Updated Orders: " + f.getNoOfOrder());
            System.out.println("Updated Customers: " + f.getNoOfCustomer());
        }
    }

