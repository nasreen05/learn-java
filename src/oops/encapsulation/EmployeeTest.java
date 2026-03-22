package oops.encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("Smith", 101, "900000", "Software Engineer", "developer");
        System.out.println("user name is :" + e.getUserName());
        System.out.println("Id is :" + e.getId());
        System.out.println("salary is :" + e.getSalary());
        System.out.println("role is :" + e.getRole());
        System.out.println("dname is :" + e.getDname());

    }

}
