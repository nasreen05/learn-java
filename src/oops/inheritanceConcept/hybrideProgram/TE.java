package oops.inheritanceConcept.hybrideProgram;

public class TE extends Employee {
    int bugs;

    void getTE(int b) {
        bugs = b;
    }

    void showTE() {
        System.out.println("No. of Bugs: " + bugs);
    }
}
