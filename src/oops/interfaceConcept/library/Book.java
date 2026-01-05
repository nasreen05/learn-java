package oops.interfaceConcept.library;

    public class Book implements Cloneable {

        private String name;
        private Author author;

        public Book(String name, Author author) {
            this.name = name;
            this.author = author;
        }

        public static void main(String[] args) throws CloneNotSupportedException {

            Author author = new Author("Raj", 26);
            Book book = new Book("Wings of Fire", author);

            Book book1 = (Book) book.clone();

            System.out.println(book);
            System.out.println(book1);

            System.out.println(book.name);
            System.out.println(book1.name);

            System.out.println(book.author.getName());
            System.out.println(book1.author.getName());

            book.name = "Java";
            System.out.println(book);
            System.out.println(book1);

            System.out.println(book.name);
            System.out.println(book1.name);

            System.out.println(book.author.getName());
            System.out.println(book1.author.getName());

            book.author.setName("Ram");
            System.out.println(book.name);
            System.out.println(book1.name);

            System.out.println(book.author.getName());
            System.out.println(book1.author.getName());
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            // return super.clone(); // (for shallow copy)
            Author author = new Author(this.author.getName(), this.author.getAge());
            Book book = new Book(this.name, author);
            return book;
        }

        // Shallow cloning – when class has primitive data type
        // Deep cloning – when class has dependent object
    }