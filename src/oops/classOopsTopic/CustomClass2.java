package OOpsClassTopic;

class School{
    int id;
    String name;
     int salary;


    public void printDetails(){
    System.out.println("the id of the school is"+id);
    System.out.println(" the name of the school is "+ name );
    }
    public int getSalary(){
        return salary;
    }

}
public class CustomClass2 {
public static void main(String[] args){
    System.out.println("The school details.........");

    School neha= new School();
    School sneha = new School();

    neha.id=345;
    neha.name="Daspara High School";
    neha.salary=21;


    sneha.id=987;
    sneha.name="Chopra High School";
    sneha.salary=34;
    int  salary = sneha.getSalary();
    System.out.println(salary);

    neha.printDetails();
    sneha.printDetails();
}
}