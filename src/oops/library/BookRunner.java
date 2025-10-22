package library;

public class BookRunner {
        public static void main(String[] args) {
            Book b1 = new Book("Java", "James Gosling", 550);
            Book b2 = new Book("Java", "James Gosling", 550);

            System.out.println(b1);
            System.out.println(b2);
            System.out.println("== : " + (b1 == b2));
            System.out.println("equals : " + b1.equals(b2));
        }
    }

