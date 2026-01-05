package oops.constructorConcept;

class BookShop {

    private String title;
    private String author;
    private int price;

    BookShop() {
        this(null, null, 0);
        System.out.println("Book details");
    }

    BookShop(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Book Author details");
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Book {
   
    public static void main(String[] args) {

        BookShop book = new BookShop();
        BookShop book1 = new BookShop("Java Basics", "Neha", 200);

        book.display();
        book1.display();


    }
}
