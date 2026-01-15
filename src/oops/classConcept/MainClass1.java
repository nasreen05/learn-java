package oops.classConcept;
class Book{
    int page =9;
    String name="Peer-a-kamil";
    void isCover(){
        System.out.println("Available");
    }
    void notCover(){
        System.out.println("Not Available");
    }
}
public class MainClass1 {
    public static void main(String[] args) {
        Book b=new Book();
        System.out.println("Book page total = "+ b.page);
        System.out.println("Book name = " + b.name);
        b.isCover();
        b.notCover();
    }
}
