package advance.collectionConcept;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSort {
    public static void main(String[] args){
        TreeSet treeSet= new TreeSet((Comparator) new MyComparator());
        treeSet.add(1000);
        treeSet.add(400);
        treeSet.add(1);
        treeSet.add(340);
        System.out.println(treeSet);

        //compare -public int compareTo(Object obj);
        //default natural sorting order
        //java.lang
        // Inbuilt comparator classes -String , Integer

        //Customer sorting order -Comparator
        //Comparator - int compare (object obj1, object obj2)
        //Commparator - boolean equals(Object obj)
        //java.util


        TreeSet treeSet1 = new TreeSet((Comparator) new MyStringComparator());

        treeSet.add("Z");
        treeSet1.add("A");

        treeSet1.add("Z");
        treeSet1.add("AZ");
        System.out.println(treeSet1);
    }
}
