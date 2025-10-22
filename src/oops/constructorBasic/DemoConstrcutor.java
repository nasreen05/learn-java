package DemoConstructor;

class Person1 {

    private String name;
    private int age;

    Person1() {
        this(null, 0);
        System.out.println("Default constructor");
    }

    Person1(String name, int age) {
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

class Employee1 extends Person1 {
    private int salary;

    Employee1() {
        this(null, 0, 0);
        System.out.println("Default constructor");
    }

    Employee1(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    void display() {
        System.out.println("name: " + getName() + ", age: " + getAge() + ", salary: " + salary);
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
