package advance.collectionConcept.hashMap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer, String>hashMap1=new HashMap(100);
        HashMap<Integer, String>hashMap2=new HashMap(20, 0.05f);
        HashMap<Integer, String>hashMap3=new HashMap(hashMap1);

    HashMap<Integer, String> hashMap = new HashMap();
    hashMap.put(101,"Kumar");
    hashMap.put(102,"raj");
    hashMap.put(103,"Abishek");

    // hashMap.put("Abhishek, 110); not possible  since we have hashmap created with generic
    // Integer , String
    System.out.println(hashMap);
    Object value =hashMap.get(110);
    System.out.println(value);
    Object value1=hashMap.get(200);
    System.out.println(value1);

    hashMap.put(101, "suraj");
    System.out.println(hashMap);
    System.out.println(hashMap.get(101));
    //hashmap. size();

        Set<Integer> keys=hashMap.keySet();
    System.out.println(keys);
        Collection<String>values=hashMap.values();
    System.out.println(values);

    Set<Map.Entry<Integer, String>>entrySet=hashMap.entrySet();
    System.out.println("size in Entry"+entrySet.size());
        Iterator iterator= entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String>entry=(Map.Entry<Integer,String>)iterator.next();
      System.out.println(entry.getKey()+"="+entry.getValue());

        }
        Iterator keyIterator= keys.iterator();
        while(keyIterator.hasNext()){
            Integer key=(Integer)keyIterator.next();
            String stringValue=hashMap.get(key);
      System.out.println(hashMap.get(key));
        }
    System.out.println(hashMap1);
        hashMap1.putAll(hashMap);
    System.out.println(hashMap1);
  }
}
