package oops.interfaceConcept.library;

public class BookRunner {
    public BookRunner(String java, String jamesGosling, int i) {
    }

    public static void main(String[] args) {
    BookRunner b1 = new BookRunner("Java", "James Gosling", 550);
    BookRunner b2 = new BookRunner("Java", "James Gosling", 550);

            System.out.println(b1);
            System.out.println(b2);
            System.out.println("== : " + (b1 == b2));
            System.out.println("equals : " + b1.equals(b2));
        }
    }

