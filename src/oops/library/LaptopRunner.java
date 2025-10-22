package library;

public class LaptopRunner {
        public static void main(String[] args) {
            Laptop l1 = new Laptop("HP", "i5", 16);
            Laptop l2 = new Laptop("HP", "i5", 16);

            System.out.println(l1);
            System.out.println(l2);
            System.out.println("== : " + (l1 == l2));
            System.out.println("equals : " + l1.equals(l2));
        }
    }


