package library;

public class StudentRunner {
        public static void main(String[] args) {
            Student s1 = new Student("Amit", 11, 85.5);
            Student s2 = new Student("Amit", 11, 85.5);

            System.out.println(s1);
            System.out.println(s2);
            System.out.println("== : " + (s1 == s2));
            System.out.println("equals : " + s1.equals(s2));
        }
    }


