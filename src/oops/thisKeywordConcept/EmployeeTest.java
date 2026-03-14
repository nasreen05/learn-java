package oops.thisKeywordConcept;
class Employee {

    int id;
    String name;
    int mobNo;

    public Employee(int id , String name, int mobNo) {
        this.id = id;
        this.name = name;
        this.mobNo = mobNo;
    }
}
public  class EmployeeTest {
    public static  void displayDetails(Employee e) {
        System.out.println(" Id is :"+ e.id);
        System.out.println("name is :"+ e.name);
        System.out.println("mobNo is :"+e.mobNo);
        System.out.println("=====================");
    }
    public  static void main(String[]args){
        Employee e1= new Employee(101,"neha",412335433);
        displayDetails(e1);
        Employee e2= new Employee(102,"Riya",335433);
        displayDetails(e2);
        Employee e3= new Employee(103,"Tania",12335433);
        displayDetails(e3);
        Employee e4= new Employee(104,"Naseen",982335433);
        displayDetails(e4);

    }
    }
