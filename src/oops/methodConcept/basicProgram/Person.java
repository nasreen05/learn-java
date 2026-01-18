package oops.methodConcept.basicProgram;
class GirlsName{
    String name;
    long phone;
    String address;
}
class Harshit{
    static void tellMeGirlName(){
        System.out.println("Girl Name Sunny");
    }
    static long getGirlNumber(){
        System.out.println("Harshit sharing the girl Number");
        return 963248764382l ;
    }
    static long [] getGirlsDetails(){
        System.out.println("Harshit collecting Girls Number and sharing");
       long [] arr={84365298l,8746984l,86512487l};
       return  arr;
    }
    static GirlsName getGirlDetails(){
        System.out.println("Harshit will collect the girl infornation");
        GirlsName g= new GirlsName();
        g.name="Reshma";
        g.phone=364448172469l;
        g.address="Mumbai";
        return  g;
    }
}
public class Person {
    public static void main(String[] args) {
        Harshit.tellMeGirlName();
        long phone = Harshit.getGirlNumber();
        System.out.println("Now Deepak receiver the phone number and dailing that number");
        long [] arr=Harshit.getGirlsDetails();
        System.out.println("Now Deepaak  receive all the phone number");
        for( int i=1; i<arr.length ;i++){
            System.out.println("Dailing "+arr[i]);
        }
        GirlsName g= Harshit.getGirlDetails();
        System.out.println("Now Deepak has info about that girl");
        System.out.println("Name :"+ g.name);
        System.out.println("Phone :"+g.phone);
        System.out.println("address :"+g.address);
    }
}
