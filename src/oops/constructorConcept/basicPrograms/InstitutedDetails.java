package oops.constructorConcept.basicPrograms;
class Instituted {
    int id;
    String name;
    String dept;

    public void details() {
        System.out.println(name + "is working");
    }
}
public class InstitutedDetails {
    public static void main(String[] args) {
        Instituted in1= new Instituted();
        in1.id=101;
        in1.name="Sneha";
        in1.dept="CA";
        System.out.println("id is : "+ in1.id);
        System.out.println("name is : "+in1.name);
        System.out.println("dept is : "+in1.dept);
        in1.details();
        System.out.println("----------------------------");


        Instituted in2= new Instituted();
        in2.id=102;
        in2.name="Neha";
        in2.dept="BCA";
        System.out.println("id is : "+ in2.id);
        System.out.println("name is : "+in2.name);
        System.out.println("dept is : "+in2.dept);
        in2.details();
        System.out.println("----------------------------");


        Instituted in3= new Instituted();
        in3.id=103;
        in3.name="Reha";
        in3.dept="CSA";
        System.out.println("id is : "+ in3.id);
        System.out.println("name is : "+in3.name);
        System.out.println("dept is : "+in3.dept);
        in3.details();
        System.out.println("----------------------------");

    }
}
