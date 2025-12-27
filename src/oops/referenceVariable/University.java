package oops.referenceVariable;
class Department{
    String D_name;
    String HOD;
    int   D_id;

    void Details(){
        System.out.println("==================University Details================");
        System.out.println("D_name : "+ D_name);
        System.out.println("HOD : "+ HOD);
        System.out.println("D_id :"+D_id);
    }
}
public class University {
    public static void main(String[] args) {
        Department d1=new Department();

        d1.D_name="CSE";
        d1.HOD="Reshma";
        d1.D_id=101;

        d1.Details();


        Department d2=d1;
        d2.D_name="ECE";
        d2.Details();


        Department d3=d1;
        d3.D_name="BCA";
        d3.Details();

    }
}
