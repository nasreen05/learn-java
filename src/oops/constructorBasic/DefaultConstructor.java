package DemoConstructor;
class Youtube {
    private String userName;
    private String email;
    private int subscriber;

  /*  Youtube() {
        this.userName = Null;
        this.email = Null;
        this.subscriber = 0;
        System.out.println("Default Constructor called");
    }
    */

    public void display() {
        System.out.println("UserName: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Subscribers: " + subscriber);
    }
}
    public class DefaultConstructor {
        public static void main(String[] args) {
            Youtube youtube = new Youtube();
            youtube.display();
        }
    }

