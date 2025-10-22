package library;

public class Book {

        private String title;
        private String author;
        private double price;

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book [Title=" + title + ", Author=" + author + ", Price=" + price + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Book) {
                Book b = (Book) obj;
                return this.title.equals(b.title) && this.author.equals(b.author);
            }
            return false;
        }
    }


