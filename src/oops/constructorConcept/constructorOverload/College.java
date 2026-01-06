package oops.constructorConcept.constructorOverload;
class School{
     final int registerNumber;
         String name;
         School(String n, int reg){
           name=n;
           registerNumber=reg;
         }
         void details(){
             System.out.println("registerNumber"+registerNumber);
             System.out.println("name"+name);
    }
}
public class College {
    public static void main(String[] args) {
        School st1= new School("Subhash",101);
        st1.details();
        School st2= new School("Sohel",102);
        st2.details();
    }
}
