package advance.collectionConcept.treeMap;

    import java.util.*;

    public class TreeMapDemo {

        public static void main(String[] args) {

//        TreeMap<String, Integer> treeMap1 = new TreeMap(Comprator);
//        TreeMap<String, Integer> treeMap1 = new TreeMap(SortedMap);
//        TreeMap<String, Integer> treeMap1 = new TreeMap(Map);
            TreeMap<String, Integer> treeMap = new TreeMap();
            treeMap.put("Zimbambwe", 7);
            treeMap.put("India", 2);
            treeMap.put("Austrialia", 1);
            treeMap.put("SoutAfrica", 3);
//        treeMap.put(null, 6);
//        treeMap.put(1, 5);

//        System.out.println(treeMap);

            System.out.println(treeMap.get("Austrialia"));
            treeMap.remove("India");
//        System.out.println(treeMap);


            Set<String> keys = treeMap.keySet();
            System.out.println("printing tree map using keys");
            Iterator iterator = keys.iterator();
            while(iterator.hasNext()) {
                String key = (String) iterator.next();
                System.out.println(key + " - " + treeMap.get(key));
            }

            Set< Map.Entry<String, Integer>> entries = treeMap.entrySet();
            System.out.println("printing treemap using entryset");
            Iterator iterator1 = entries.iterator();
            while(iterator.hasNext()) {
                Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator1.next();
                System.out.println(entry.getKey() + " -- " + entry.getValue());
            }

            // TreeMap
            // null is not allowed in key
            // key cannot be duplicate
            // value can be duplocate
            // Insertion Order is  not preserved
            // Default is sorted in natural order




        }
    }


