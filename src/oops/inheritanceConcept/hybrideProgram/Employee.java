package oops.inheritanceConcept.hybrideProgram;

public class Employee extends Person {
    int eid;

    void getEmployee(int id) {
        eid = id;
    }

    void showEmployee() {
        System.out.println("Employee ID: " + eid);
    }
}

