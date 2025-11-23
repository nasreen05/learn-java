package advance.collectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

    public class LinkedHashSetDemo {
        public static void main(String[] args) {
            // LinkedHashSet will maintain the order

            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet1 = new LinkedHashSet(10);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(10, 0.5f);
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(linkedHashSet1);

            // create(add) , update(set), remove(delete) , get(fetch)
            linkedHashSet.add("Java");
            linkedHashSet.add("Javascript");
            linkedHashSet.add("sql");
            linkedHashSet.add(1000);
            linkedHashSet.add(1000);
            System.out.println(linkedHashSet);
            for(int i=0; i<linkedHashSet.size();i++) {
//            System.out.println(linkedHashSet.get);
            }
            Iterator iterator = linkedHashSet.iterator();
            System.out.println("linkedHashset printing using iterator");
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            ArrayList arrayList = new ArrayList(linkedHashSet);
            linkedHashSet.clear();
            System.out.println("After cleaing linkedhashset");
            System.out.println(linkedHashSet);
            System.out.println(arrayList);


        }
    }

