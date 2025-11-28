package advance.collectionConcept.setConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

    public class SetQuestion {

        public static void main(String[] args) {

            System.out.println("Create a HashSet<Integer> with duplicate numbers — verify duplicates are removed.");
            Set<Integer> integers = new HashSet<>();
            integers.add(100);
            integers.add(101);
            integers.add(100);
            integers.add(100);
            for(Integer integer: integers) {
                System.out.println(integer);
            }

            System.out.println("Create a TreeSet<String> and observe the default sorting.\n");
            Set<String> treeSet = new TreeSet<>();
            treeSet.add("Yeshwanth");
            treeSet.add("Abishek");
            treeSet.add("Ram");
            treeSet.add("Suraj");

            for(String name : treeSet) {
                System.out.println(name);
            }

            System.out.println("Check if a set contains \"Abshiek\".============");
            System.out.println(treeSet.contains("Abishek"));


            System.out.println("Find the smallest and largest number in a TreeSet.");
            Set<Integer> treeSetNumbers = new TreeSet<>();
            treeSetNumbers.add(1000);
            treeSetNumbers.add(10);
            treeSetNumbers.add(100);
            treeSetNumbers.add(10);
            treeSetNumbers.add(5);

            System.out.println(treeSetNumbers);

            System.out.println("Replace \"Suraj\" with \"Kiran\" in a set.--------------------------");
            System.out.println(treeSet);
            treeSet.remove("Suraj");
            treeSet.add("Kiran");
            System.out.println(treeSet);
            treeSet.remove("Kiran");
            System.out.println(treeSet);
            System.out.println("Remove all elements starting with \"T\".");
            Iterator iterator = treeSet.iterator();
            while(iterator.hasNext()) {
                String name= (String) iterator.next();
                if(name.startsWith("A")) {
                    iterator.remove();
                }
            }
            System.out.println(treeSet);






        }
    }


