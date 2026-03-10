package oops.constructorConcept.basicPrograms;
class Employee{
    int id;
    String name;
    double salary;
    public void work(){
        System.out.println(name +" Is working");
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Neha";
        e1.salary = 1234;
        System.out.println("id is = " + e1.id);
        System.out.println("name is = " + e1.name);
        System.out.println("salary is = " + e1.salary);
        e1.work();
        System.out.println("--------------------------------");
        Employee e2 = new Employee();
        e2.id = 142;
        e2.name = "laile";
        e2.salary = 894367;
        System.out.println("id is : " + e2.id);
        System.out.println("name is : " + e2.name);
        System.out.println("salary is :" + e2.salary);
        e2.work();
        System.out.println("---------------------------------");
        Employee e3 = new Employee();
        e3.id = 152;
        e3.name = "majnu";
        e3.salary = 8965874;
        System.out.println("id : " + e3.id);
        System.out.println("name :" + e3.id);
        System.out.println("salary : " + e3.salary);
        e3.work();

    }
}
