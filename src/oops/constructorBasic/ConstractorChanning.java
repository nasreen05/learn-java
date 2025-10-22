package DemoConstructor;
// Parent class
class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this("Unknown", 0);   // ✅ Calls another constructor in same class
        System.out.println("Person: Default constructor");
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person: Parameterized constructor");
    }
}

// Child class
class Employee extends Person1 {
    int salary;

    // Default constructor
    Employee() {
        this("Not Given", 0, 0);   // ✅ Calls 3-parameter constructor in same class
        System.out.println("Employee: Default constructor");
    }

    // Parameterized constructor
    Employee(String name, int age, int salary) {
        super(name, age);   // ✅ Calls parent (Person) parameterized constructor
        this.salary = salary;
        System.out.println("Employee: Parameterized constructor");
    }

   /* void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }*/
}
public class ConstractorChanning {
        public static void main(String[] args) {
            System.out.println("---- Creating Employee 1 ----");
            Employee1 e1 = new Employee1();  // Default constructor chaining

            System.out.println("\n---- Creating Employee 2 ----");
            Employee1 e2 = new Employee1("Neha", 22, 50000);  // Parameterized constructor

            e1.display();
            e2.display();
        }
    }

