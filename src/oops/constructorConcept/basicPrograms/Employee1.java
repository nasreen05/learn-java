package oops.constructorConcept.basicPrograms;

public class Employee1 extends Person1 {
    private int salary;

    public Employee1() {
        this(null, 0, 0);
        System.out.println("Default constructor");
    }

    public Employee1(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public void display() {
        System.out.println("name: " + getName() + ", age: " + getAge() + ", salary: " + salary);
    }
}
