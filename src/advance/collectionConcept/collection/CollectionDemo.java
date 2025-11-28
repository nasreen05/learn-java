package advance.collectionConcept.collection;

import java.io.Serializable;
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        // default capacity = 10
        // new capacity = (old capactity * 3/2) +1
        // 16
        ArrayList arrayList1 = new ArrayList(20);
        System.out.println(arrayList.size());
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(100);
        arrayList.add(110);
//        default capacity = 10;
//                new capacity = (defaultcapacity * 3/2) + 1;
        //  internally array
        //


        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains(50));
        arrayList.remove(4);
        System.out.println(arrayList.contains(50));
        System.out.println(arrayList.size());
        arrayList.add(2, 130);
        System.out.println(arrayList);
//        arrayList.clear();
        System.out.println(arrayList);
        arrayList1.add(201);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
        arrayList.add(1, 1000);
        System.out.println(arrayList);
        arrayList.set(4, 1500);
        System.out.println(arrayList);
        System.out.println(arrayList.get(3));
        arrayList.add(null);
        System.out.println(arrayList);
        arrayList.add(null);
        System.out.println(arrayList);
        System.out.println(arrayList.lastIndexOf(null));
        arrayList.add(10);
        System.out.println(arrayList);
        System.out.println(arrayList.lastIndexOf(1000));
        System.out.println(arrayList1);
//        arrayList.retainAll(arrayList1);
        System.out.println("After retainAll");
        System.out.println(arrayList);
        System.out.println();
        // add, remove, addAll, contains, clear
        // clone , retainAll, size
        // isEmpty ,
        // add(index, value)
        // set(index, value)





        //   Create 10 Arraylist and use method to add data
        //       and use all the methods of arraylist
        // ArrayList implements List interface
        // ArrayList default capacity = 10
        // ArrayList newcapactity = (oldcapacity * 3/2) + 1;
        // ArrayList datastructure is array
        // Arraylist retrieval is fast i.e fetching is fast
        // based on index
        // Arraylist is insertion or deletion will take time
        // Arraylist we can mutiple null values



        // Remove element from Arraylist
        // clear an arraylist
        // retain element in arraylist
        // check whether array list is empty or not
        // add an arraylist into another arraylist
        //


        // collection is a group of elements as a single unit
        // collection framework is consists of classes and interface

        System.out.println(arrayList instanceof Cloneable);


        System.out.println(arrayList instanceof Serializable);
        System.out.println(arrayList instanceof RandomAccess);
        System.out.println("Printing using for loop");
        for(int i=0;i<arrayList.size();i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        // iterator()
        // java.util, java.lang
        System.out.println("");
        System.out.println("printing using iterator");
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
//            iterator.remove();
            System.out.print(iterator.next() + " ");
        }
        // Read and Remove - iterator
        // foward direction
        ListIterator listIterator = arrayList.listIterator();
        System.out.println("printing using list iterator");
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println("priting using list iterator backward direction");
        while(listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        // listierator
        // read/remove , add, set
        // forward , backword direction



//        Iterator
//        It is present in Collection interface
//        Read/remove methods are present
//        It can go forward direction
//
//        ListIterator
//        It is present in List interface
//        Read/remove, add , set
//        We can go forward and backward direction
//
//        Create an arraylist
//        Add Abishek , ram , shivu, kumar, manoj
//        using literator and print the above array list value
//        while priting check below condition
//        if ram is found then add new element  raj
//        if kumar is found then replace kumar by venkat
//        output -  Abishek , ram , raj, shivu, venkat, manoj








    }
}











/*
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		
		int[] num= new int[6];
		
		num[0]=101;
		num[1]=102;
		num[2]=103;
		num[3]=104;
		num[4]=105;
		num[5]=106;
		
		for(int i=0; i< num.length; i++) {
			System.out.println(num[i]);
		}
		
		Set set = new TreeSet();
		set.add(107);
		set.add(103);
		set.add(106);
		set.add(104);
		set.add(105);
		
		System.out.println(set);
		
		
		/* Collection c= new ArrayList();
		
		c.add(10);
		c.add(20);
		c.add(30);
		c.add("Neha");
		c.add(50.10);
		
		System.out.println(c);

	}

}
*/
