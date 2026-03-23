package oops.encapsulation;

public class MobileTest {
       public static void main(String[] args) {

            Mobile m = new Mobile("Samsung", 25000.0, 8, 128);

            System.out.println("Brand: " + m.getBrand());
            System.out.println("Price: " + m.getPrice());
            System.out.println("RAM: " + m.getRam() + "GB");
            System.out.println("ROM: " + m.getRom() + "GB");

            // Updating values
            m.setPrice(27000.0);
            m.setRam(12);

            System.out.println("Updated Price: " + m.getPrice());
            System.out.println("Updated RAM: " + m.getRam() + "GB");
        }
    }
