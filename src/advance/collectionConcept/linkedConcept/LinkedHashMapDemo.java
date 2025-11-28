package advance.collectionConcept.linkedConcept;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

    public class LinkedHashMapDemo {

        public static void main(String[] args) {

            LinkedHashMap<String, Integer> linkedHashMap1 = new LinkedHashMap(10);
            LinkedHashMap<String, Integer> linkedHashMap2 = new LinkedHashMap(10, 0.50f);
            LinkedHashMap<String, Integer> linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
            LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Ram",1000);
            linkedHashMap.put("Abishek", 2000);
            linkedHashMap.put("Vinay", 200);
            linkedHashMap.put("Mahesh", 250);



            Integer value = linkedHashMap.get("Vina");
            System.out.println(value);

            System.out.println(linkedHashMap.isEmpty());
            System.out.println(linkedHashMap.containsKey("Abishek"));
            System.out.println(linkedHashMap.containsValue("Abishek"));
            System.out.println(linkedHashMap.containsValue(250));

            Set<String> keys = linkedHashMap.keySet();
            Iterator iterator = keys.iterator();
            System.out.println("printing linkedhashmap using keys ");
            while(iterator.hasNext()) {
                String key = (String) iterator.next();
                System.out.println(key + " - " + linkedHashMap.get(key));
            }
            Set< Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();
            Iterator iterator1 = entries.iterator();
            System.out.println("priting linked hashmap using entrySet");
            while (iterator1.hasNext()) {
                Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator1.next();
                System.out.println(entry.getKey() + " -- " + entry.getValue());
            }


            // LinkedHashMap is a child of HashMap
            // Added using put(key,value)
            // Data structure is Linked List + Hash Table
            // Insertion order is preserved
            // key cannot be duplicate
            // value can be duplicate
            //



        }
    }
