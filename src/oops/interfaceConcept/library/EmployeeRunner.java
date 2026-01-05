package oops.interfaceConcept.library;

import oops.constructorConcept.basicPrograms.Employee1;

public class EmployeeRunner {
  public static void main(String[] args) {

    Employee1 e1 = new Employee1("Neha", 101, 50000);
    Employee1 e2 = new Employee1("Neha", 101, 50000);
    System.out.println(e1);
    System.out.println(e2);
    System.out.println("== : " + (e1 == e2));
    System.out.println("equals : " + e1.equals(e2));
    System.out.println();
  }
}
