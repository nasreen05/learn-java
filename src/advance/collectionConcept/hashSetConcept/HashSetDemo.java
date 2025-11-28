package advance.collectionConcept.hashSetConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetDemo {

    public static void main(String[] args) {
        // HashSet will not maintain the order

        HashSet hashSet = new HashSet();
        HashSet hashSet1 = new HashSet(20);
        HashSet hashSet2 = new HashSet(20, 0.80f);

        ArrayList arrayList = new ArrayList();
        HashSet hashSet4 = new HashSet(arrayList);
        LinkedList linkedList = new LinkedList(arrayList);

        // 16 elements
        // 16 * 3/4 = 8
        // new capacity = old capacity * 2 = 32
        // default capacity = 16
        //
        System.out.println(hashSet.add(10));
        System.out.println(hashSet.add(50));
        System.out.println(hashSet);
        System.out.println(hashSet.add(10));
        System.out.println(hashSet);
        System.out.println("Printing toArray");
        Object[] array = hashSet.toArray();
        System.out.println(array);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(10));
        hashSet.add(null);
        System.out.println(hashSet);
        hashSet.add(null);
        System.out.println(hashSet);

        System.out.println("Hash set printing using iterator >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("printing hashset3");
        HashSet hashSet3 = new HashSet(hashSet);
        System.out.println(hashSet3);

        for(int i=0;i<hashSet.size();i++) {
//            System.out.println(hashSet.get);
        }
        ArrayList arrayList1 = new ArrayList(hashSet);
        System.out.println("hash set printing using arraylist " +
                "because hash set not containing get method");
        for(int i=0;i<arrayList1.size();i++) {
            System.out.println(arrayList1.get(i));
        }


        // add , remove, fetch ,addAll
        // add() - ArrayList
        // add() - HashSet
//        Set implements Collection interface
//        Set - it doesn't contain duplicates
//
//        HashSet implements Set interface
//        It doesn't contain duplicates
//        Data structure uses hashtable
//        Based on hashcode
//        Heterogenous data is allowed
//        null can be added, only one null is allowed
//        It not mainting the order
//        new capacity = old capacity * 2;

    }
}