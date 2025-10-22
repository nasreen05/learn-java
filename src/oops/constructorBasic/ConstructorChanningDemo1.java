package DemoConstructor;

class Person2 {
  private String name;
  private int age;

  Person2() {
    this(null, 0);
    System.out.println("Default constructor");
  }

  Person2(String name, int age) {
    this.name = name;
    this.age = age;
  }


public String getName(){

      return name;
}
public int getAge() {

      return age;
}
}

class Employee2 extends Person1 {
  private int salary;

  Employee2() {
    this(null, 0, 0);
    System.out.println("Default constructor");
  }

  Employee2(String name, int age, int salary) {
    super(name, age);
    this.salary = salary;
    System.out.println("Parametarize constructor");
  }

  void display() {
    System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Salary: " + salary);
  }
}

    public class ConstructorChanningDemo1 {
      public static void main(String[] agrs) {
        System.out.println("employee 1 details");
        Employee1 employee = new Employee1();

        System.out.println("Employee 2 details........ ");
        Employee1 employee1 = new Employee1("neha", 5, 300);
        employee.display();
        employee1.display();
      }
    }

