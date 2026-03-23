package oops.encapsulation;

public class ShoeTest {
        public static void main(String[] args) {

            Shoe s = new Shoe("Nike", 2999.99, "Black", 9, "Sports");

            System.out.println("Brand: " + s.brand);
            System.out.println("Price: " + s.getPrice());
            System.out.println("Color: " + s.getColor());
            System.out.println("Size: " + s.getSize());
            System.out.println("Type: " + s.getType());

            // Updating values
            s.setPrice(3499.99);
            s.setColor("White");

            System.out.println("Updated Price: " + s.getPrice());
            System.out.println("Updated Color: " + s.getColor());
        }
    }

