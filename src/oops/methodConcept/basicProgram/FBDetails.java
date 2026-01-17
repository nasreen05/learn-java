package oops.methodConcept.basicProgram;
class Facebook{
    String name;
    int id;
    static void welcome(){
        System.out.println("Welcome to Instagram");
    }
    void login(String n , int no){
        name=n;
        id=no;
       //  System.out.println(" Login Successful");
    }
    void details(){
        System.out.println("UserName :"+ name);
        System.out.println("Id :"+id);
        System.out.println("Login Successful");
        System.out.println("===========================");
    }
}
public class FBDetails {
    public static void main(String[] args) {
        Facebook.welcome();
        Facebook f1=new Facebook();
        f1.login("Neha",101);
        f1.details();

        Facebook f2=new Facebook();
        f2.login("Reshma",105);
        f2.details();


    }
}
