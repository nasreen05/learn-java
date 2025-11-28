package advance.collectionConcept.linkedConcept;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.RandomAccess;

    public class LinkedListDemo {

        public static void main(String[] args) {

            LinkedList linkedList = new LinkedList();
            linkedList.add(100);
            System.out.println(linkedList);
            System.out.println(linkedList.size());
            System.out.println(linkedList.contains(10));
            linkedList.add(200);
            linkedList.add(300);
            System.out.println(linkedList.size());
            System.out.println(linkedList);
            linkedList.remove(1);
            System.out.println(linkedList);
            linkedList.add(1, 500);
            System.out.println(linkedList);
            linkedList.add(null);
            System.out.println(linkedList);
            linkedList.add(null);
            System.out.println(linkedList);
            linkedList.addFirst(1);
            System.out.println(linkedList);
            linkedList.addLast(500);
            System.out.println(linkedList);
            linkedList.removeFirst();
            System.out.println(linkedList);
            linkedList.removeLast();
            System.out.println(linkedList);

            // LinkedList is class which implements List interface
            // LinkedList data structure is doubly linkedlist
            // LinkedList we can add multiple null value
            // LinkedList insertion or deletion is faster compared to Arraylist
            // LinkedList fetching or retrieval is slow




            //
            LinkedList linkedList1 = new LinkedList(linkedList);
            // no size in linkedlist
            System.out.println(linkedList1);
            System.out.println(linkedList.get(1));


            LinkedList linkedList2 = new LinkedList();
            linkedList2.add("Ram");
            linkedList2.add("Raj");
            linkedList2.add("Abhi");// add at last
            System.out.println(linkedList2);
            System.out.println(linkedList2.contains("Abhi"));
            linkedList2.remove();// remove at beginning
            System.out.println(linkedList2);
            linkedList2.addFirst("Shivu");
            linkedList2.addLast("Ramesh");
            System.out.println(linkedList2);
            linkedList2.removeFirst();
            linkedList2.removeLast();
            System.out.println(linkedList2);

            // create, update , fetch/get , delete

            // database
            // - stream of byte

            // instanceOf
            System.out.println(linkedList2 instanceof Cloneable);
            System.out.println(linkedList2 instanceof Serializable);
            System.out.println(linkedList2 instanceof RandomAccess);




            // an interface without methods are called as marker interface


            System.out.println("Linkedlist printing using iterator");
            Iterator iterator = linkedList2.iterator();
            while(iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }

            System.out.println("priting using listterator");
            ListIterator listIterator = linkedList2.listIterator();
            while(listIterator.hasNext()) {
                System.out.println(listIterator.next() + " ");
            }
            System.out.println("priting using listterator backward direction");
            while(listIterator.hasPrevious()) {
                System.out.println(listIterator.previous() + "");
            }











        }


    }