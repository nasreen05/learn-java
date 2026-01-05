package oops.interfaceConcept.library;
import oops.exceptionConcept.Bike;

import java.util.Objects;
 // assuming Bike class exists in this package

// Every class will have default inheritance from Object class
public class Employee2 {

    private String name;
    private int id;

    public Employee2() {}

    public Employee2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Employee2 employee = new Employee2("Ram", 12345);
        System.out.println(employee.toString());
        System.out.println(employee);

        // FQCN (Fully Qualified Class Name)
        Employee2 employee1 = new Employee2("Ram", 12345);

        int a = 10;
        int b = 20;
        System.out.println(a - b);

        System.out.println(employee == employee1);
        System.out.println(employee.toString());
        System.out.println(employee1.toString());

        System.out.println(employee.equals(employee1));
        System.out.println(employee.hashCode());
        System.out.println(employee1.hashCode());

        Bike bike = new Bike();
        System.out.println(employee.equals(bike));
    System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee2) {
            Employee2 employee = (Employee2) obj;
            if (this.name.equals(employee.name)) {
                if (this.id == employee.id) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Employee details name = " + name + " id = " + id;
    }
}
