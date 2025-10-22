package DemoConstructor;

class Person4 {
  String name;
  int age;

  Person4() {
    this(null, 0);
    System.out.println("Default Construtor");
  }

  Person4(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("parametarize constructor");
  }
}

class Employee4 extends Person4 {
    int salary;

    Employee4(){
        this(null,0,0);
        System.out.println("Default Constructor");
    }
    Employee4(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
        System.out.println("Parametarize constructor");
    }
    void details(){
        System.out.println("name :" + name + "age:" + age + "salary:" + salary);


    }
}
public class PersonRunner {
    public static void main(String[]args){
        System.out.println("new Employee..");
        Employee4 e1=new Employee4();

        System.out.println("old Employee ..");
        Employee4 e2=new Employee4("neha",20,5);

        e1.details();
        e2.details();


        }
    }

