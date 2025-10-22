package DemoConstructor;

class YoutubeUser {
  String username;
  String email;
  int subsciption;

  YoutubeUser(String username, String email) {
    this(username, email, 150);
    System.out.println("This is regular user");
    this.username = username;
    this.email = email;
  }

  YoutubeUser(String username, String email, int subsciption) {
    System.out.println("This is premium user");
    this.username = username;
    this.email = email;
    this.subsciption = subsciption;
  }

  void display() {
    System.out.println("Username: " + username);
    System.out.println("Email: " + email);
    System.out.println("Subscribe: " + subsciption);
  }
}

public class ConstructorChainDemo {
  public static void main(String[] args) {
    YoutubeUser youtubeUser = new YoutubeUser("Neha30", "neha@gmail.com");
    youtubeUser.display();
  }
}
