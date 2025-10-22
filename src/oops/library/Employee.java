package library;

public class Employee {
  private String name;
  private int id;

  public Employee() {}

  public Employee(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public static void main(String[] args) {
    Employee employee = new Employee("Neha", 12345);
    System.out.println(employee.toString());

    // FQCN -Fully qualified class name
    Employee employee1 = new Employee("neha", 12345);
    int a = 10;
    int b = 20;
    System.out.println(a == b);
    System.out.println(employee == employee1);
    System.out.println(employee.toString());
    System.out.println(employee1.toString());
    System.out.println(employee.equals(employee1));
    // Bike bike=new bike();
    // System.out.println(employee.equals(bike));
  }

  // public String toString90{
  // return "toString is override in Employee class";
  // }
  public boolean equals(Object obj) {
    if (obj instanceof Employee) {
      Employee employee = (Employee) obj;
      if (this.id == employee.id) {
        return true;
      }
      return false;
    }
    return false;
  }
  // return false;
  // }

}
