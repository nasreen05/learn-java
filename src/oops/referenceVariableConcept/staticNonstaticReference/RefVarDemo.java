package oops.referenceVariableConcept.staticNonstaticReference;

import java.net.CookieHandler;

class Collage{
    String collageName;
    String collageAddress;
    Collage(String collageName , String collageAddress){
        this.collageName=collageName;
        this.collageAddress=collageAddress;
    }
    void collageDetails(){
        System.out.println("===collage Details===");
        System.out.println("collage name :"+collageName);
        System.out.println("Collage address :"+collageAddress);
    }
}
class Student{
    static Collage collage;
    String studentName;
    String studentAddress;
        Student(String studentName , String studentAddress){
            this.studentName=studentName;
            this.studentAddress=studentAddress;
        }
        void studentDetails(){
            collage.collageDetails();
            System.out.println("=======Student Details========");
            System.out.println("Student name :"+studentName);
            System.out.println("Student address :"+studentAddress);

    }
}
public class RefVarDemo {
    public static void main(String[] args) {
        Student.collage=new Collage("Aliah University","kolkata");
        Student st1=new Student("suhel","delhi");
         Collage t1=new Collage("Kolkata collage ", "kolkata");
    Student st2=new Student("Reshma ","Delhi");
    Student st3 =new Student("Subhash","Mumbai");
    st1.studentDetails();
    st2.studentDetails();
    st3.studentDetails();
    }
}
