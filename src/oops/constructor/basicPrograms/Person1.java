package oops.constructor.basicPrograms;

public class Person1 {

    private String name;
    private int age;

    Person1() {
        this(null, 0);
        System.out.println("Default constructor");
    }

    protected Person1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameter Constructor");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class DemoConstrcutor {
    public static void main(String[] agrs) {
        Employee1 employee = new Employee1();
        Employee1 employee1 = new Employee1("neha", 22, 200);

        employee.display();
        employee1.display();
    }
}
