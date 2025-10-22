package DemoConstructor;

class YouTube {

  private String usename;
  private String email;
  private int subscribe;

  YouTube(String usename, String email) {
    this(usename, email, 230);
    System.out.println(" regular user");
    this.usename = usename;
    this.email = email;
  }

  YouTube(String usename, String email, int subscribe) {
    System.out.println("Prime user ");
    this.usename = usename;
    this.email = email;
    this.subscribe = subscribe;
  }

  void display() {
    System.out.println("Usename: " + usename);
    System.out.println("Email: " + email);
    System.out.println("Subscribe: " + subscribe);
  }
}

public class UserDefineCons {
  public static void main(String[] args) {
    YouTube youtube = new YouTube("Neha", "neha@email", 230);
    youtube.display();
    YouTube youtube1 = new YouTube("Rafia", "rafia@email", 330);
    youtube1.display();
  }
}
