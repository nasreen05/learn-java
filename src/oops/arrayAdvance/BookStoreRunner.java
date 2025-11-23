package oops.arrayAdvance;

class BookStoreRunner {
  public static void main(String[] args) {
    BookStore[] books = new BookStore[5];
    BookStore book1 = new BookStore();
    book1.setBookName("Pride and Prejudice");
    book1.setWriter("Jane Austen");

    BookStore book2 = new BookStore();
    book2.setBookName("Moby Dick");
    book2.setWriter("Herman Melville");

    BookStore book3 = new BookStore();
    book3.setBookName("1984");
    book3.setWriter("George Orwell");

    BookStore book4 = new BookStore();
    book4.setBookName("The Hobbit");
    book4.setWriter("J.Tolkien");

    BookStore book5 = new BookStore();
    book5.setBookName("To Kill a Mockingbird");
    book5.setWriter("Harper Lee");

    for (int i = 0; i < books.length; i++) {
      if (i == 0) {
        books[i] = book1;
      } else if (i == 1) {
        books[i] = book2;
      }
      if (i == 1) {
        books[i] = book2;
      } else if (i == 2) {
        books[i] = book3;
      } else if (i == 3) {
        books[i] = book4;
      } else if (i == 4) {
        books[i] = book5;
      }
    }

    for (int i = 0; i < books.length; i++) {
      BookStore book = books[i];
      if (book != null) {
        System.out.println("Book Name");
        System.out.println(book.getBookName());
        System.out.println("Writer");
        System.out.println(book.getWriter());
        System.out.println();
      }
    }
  }
        }