package oops.classConcept;

public class Employee {

    String name;
    int age;
    float rating;

    void details() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("rating = " + rating);

    }

}
    class main {
        public static void main(String[] args) {
            Employee e1 = new Employee();
            e1.name = "Neha";
            e1.age = 20;
            e1.rating = 5.5f;

            Employee e2 = new Employee();
            e2.name = "sneha";
            e2.age = 45;
            e2.rating = 6.6f;


            e1.details();
            e2.details();
            //  System.out.println(e1.hashcode());
        }

    }

