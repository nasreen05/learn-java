package oops.methodConcept.basicProgram;
class Instagram{
    String name;
    int id;
    static  void Welcome(){
        System.out.println("Welcome to the instagram");
    }
     void singUp(String n, int p){
        name=n;
        id=p;
         System.out.println("sigh up successful ");
     }
     void details(){
         System.out.println(" ID : " +id);
         System.out.println( " User name :"+ name );

     }
}
public class InstagramDetails {

    public static void main(String[] args) {
        Instagram.Welcome();

        Instagram i1= new Instagram();
        i1.singUp("neha",101);
        i1.details();

        Instagram i2=new Instagram();
        i2.singUp("Reshma",102);
        i2.details();

    }}
