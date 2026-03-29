package oops.inheritanceConcept.hybrideProgram;

public class Student  extends Person {
    String course;

    void getStudent(String c) {
        course = c;
    }

    void showStudent() {
        System.out.println("Course Type: " + course);
    }
}