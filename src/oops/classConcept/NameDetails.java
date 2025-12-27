package oops.classConcept;
class Institution{
    String clgName;
    String stName;
    int id;

    void InsDetails(){
        System.out.println("ClgName="+clgName);
        System.out.println("stName ="+stName);
        System.out.println("IntId = "+id);

    }
}
public class NameDetails {
    public static void main(String[] args) {
        Institution in1=new Institution();
        in1.stName="Aliah ";
        in1.clgName="Aliah University";
        in1.id=101;

        in1.InsDetails();
    }
}
