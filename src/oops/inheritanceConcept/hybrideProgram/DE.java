package oops.inheritanceConcept.hybrideProgram;

public class DE extends Employee {
    int modules;

    void getDE(int m) {
        modules = m;
    }

    void showDE() {
        System.out.println("No. of Modules: " + modules);
    }
}
