package oops.constructorConcept.constructorOverload;
class Institute{
    final int registrationNumber;
    String name;
    Institute(String n, int regNo){
        name=n;
        registrationNumber=regNo;

    }
    void details(){
        System.out.println("Name = "+ name);
        System.out.println("Registration No ="+registrationNumber);
    }
}
public class University {
    public static void main(String[] args) {
        Institute i1=new Institute(" Neha ",501);
        Institute i2=new Institute(" Reshma ",502);

        i1.details();
        i2.details();

        }

    }
