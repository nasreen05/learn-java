package oops.inheritanceConcept.hybrideProgram;

public class Person {
        String name;
        int age;

        void getPerson(String n, int a) {
            name = n;
            age = a;
        }

        void showPerson() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
