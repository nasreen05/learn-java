package oops.encapsulation;

public class StudentTest {
      public static void main(String[] args) {

            Student s = new Student("Neha", 21, 101, "Female", "Full Stack");

            System.out.println("Student Name: " + s.getName());
            System.out.println("Student Age: " + s.getAge());
            System.out.println("Student ID: " + s.getId());
            System.out.println("Gender: " + s.gender);
            System.out.println("Course Type: " + s.courseType);

            // Updating values
            s.setName("Sneha");
            s.setAge(22);
            s.setId(102);

            System.out.println("Updated Name: " + s.getName());
            System.out.println("Updated Age: " + s.getAge());
            System.out.println("Updated ID: " + s.getId());
        }
    }
