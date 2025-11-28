package advance.collectionConcept.treeSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

    public class TreeSetDemo {

        public static void main(String[] args) {
            TreeSet treeSet = new TreeSet();
            treeSet.add("Z");
            treeSet.add("A");
            // A-Z 65-   a-z 97-
            // compareTo
            treeSet.add("Z");
            treeSet.add("AZ");
            System.out.println(treeSet);
//        treeSet.add(10);
//        this is not possible will get an exception ClassCastException
//        System.out.println(treeSet);
            // homogenous data
            // Java is Object oriented programming
//        treeSet.add(null);
            // null cannot be added in TreeSet
            System.out.println(treeSet);


            TreeSet treeSet1 = new TreeSet();
            treeSet1.add(100);
            treeSet1.add(10);
            treeSet1.add(1);
            treeSet1.add(1000);
//        System.out.println(treeSet1);
//        treeSet1.add("java");
//        System.out.println(treeSet1);

//        for(int i=0; i<treeSet1.size(); i++) {
//            System.out.println(treeSet1.get());
//        }
            System.out.println("Treeset printing using arraylist");
            ArrayList arrayList = new ArrayList(treeSet1);
            for(int i=0;i<arrayList.size();i++) {
                System.out.println(arrayList.get(i));
            }
            System.out.println("Treeset printing using iterator");
            Iterator iterator = treeSet1.iterator();
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            TreeSet treeSet2 = new TreeSet(arrayList);
            System.out.println(treeSet2);
            // TreeSet is class
            // It holds homogenous data
            // It doesn't contain duplicate data
            // It doesn't contain null value
            // It is sorting ascending order
            // If  we add heterogenous data it gives ClassCastException
            // If we add null value it gives NullPointerException



//        compareTo -
//        0 - equal first number is equal to other number
//          -1 first number is less than other number
//            1  first number is greater than other number

        }
    }

