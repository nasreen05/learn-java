package advance.collectionConcept.sortExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortInteger {
    public static void main(String[] args){
                List<Integer> numbers = Arrays.asList(50, 10, 75, 20, 40);

                Collections.sort(numbers);

                System.out.println("Ascending: " + numbers);


//-----------------------------------------------------------------------------------
    System.out.println(" Check if a list contains a given element------------------------------");
    List<Integer> number = Arrays.asList(10, 20, 30, 40, 50);

        if (numbers.contains(30)) {
            System.out.println("30 found!");
        } else {
            System.out.println("Not found.");
        }



//------------------------------------------------------------------------------------------
    System.out.println("Find the first and last occurrence of a given number in a list------------------");

        List<Integer> nums = Arrays.asList(10, 20, 30, 20, 40, 20, 50);

        int first = nums.indexOf(20);
        int last  = nums.lastIndexOf(20);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);


//------------------------------------------------------------------------------------
    System.out.println("Given a list of strings, find all elements starting with \"A\".------------------");
        List<String> names = Arrays.asList("Ayesha", "Neha", "Amit", "Reshma", "Anusha");

        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }





        //-----------------------------------------------------------------------------------
    System.out.println(" Given a list of employees, find employees with salary > 50,000-----------------------------");
        class Employee {
            int id;
            String name;
            double salary;

            Employee(int id, String name, double salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }

            public String toString() {
                return id + " - " + name + " - " + salary;
            }
        }

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "Neha", 45000));
        empList.add(new Employee(2, "Reshma", 55000));
        empList.add(new Employee(3, "Ayesha", 65000));

        for (Employee e : empList) {
            if (e.salary > 50000) {
                System.out.println(e);
            }
        }






    System.out.println("Update the 5th element in a list---------------------------------");
        List<String> fruits = new ArrayList<>(
                Arrays.asList("Apple", "Banana", "Grapes", "Mango", "Orange")
        );

        fruits.set(4, "Pineapple");

        System.out.println(fruits);



        System.out.println("Update the salary of an employee with id = 1001------------------------------------");
        for (Employee e : empList) {
            if (e.id == 1001) {
                e.salary = 75000;   // update salary
                System.out.println("Updated: " + e);
            }
        }






        System.out.println("Remove an element by index------------------------------");
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        list.remove(2);   // removes element at index 2 (30)

        System.out.println(list);








        System.out.println("Remove all even numbers from a list---------------------------------");
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10, 21, 30, 41, 50));

        nums2.removeIf(n -> n % 2 == 0);

        System.out.println(nums2);







        System.out.println(" Remove an employee whose id = 10------------------------");
        empList.removeIf(e -> e.id == 10);

        System.out.println("After deletion:");
        empList.forEach(System.out::println);

    }
}

// Collections.sort(numbers, Collections.reverseOrder());
// System.out.println("Descending: " + numbers);
