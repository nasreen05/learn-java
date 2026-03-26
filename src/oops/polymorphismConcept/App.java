package oops.polymorphismConcept;

public class App {
    public static  void login(String email, String password){
        System.out.println("login success using email & password");
    }
    public static  void login (long mobNo, String password){
        System.out.println("login success using  mobNo & password");
    }
    public static  void login(long mobNo, int Otp){
        System.out.println("login success using email & password");
    }

    public static void main(String[] args) {
        login("neha@2123","smwi23");
           login(932840948l,"21332");
           login(983490840932l,1223);
    }

}
