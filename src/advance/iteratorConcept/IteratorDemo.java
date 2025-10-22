package advance.iteratorConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
	HashSet<Integer> hs= new HashSet<Integer>();
	
       hs.add(101);
       hs.add(102);
       hs.add(103);
       hs.add(104);
       
       Iterator<Integer> iterator=hs.iterator();
       
while(iterator.hasNext()) {
	Integer next=  iterator.next();
	 System.out.println(next);

}

ArrayList<Integer> arr= new ArrayList<Integer>();

arr.add(201);
arr.add(202);
arr.add(203);
arr.add(204);

Iterator<Integer> it=arr.iterator();

while(it.hasNext()) {
Integer next=  it.next();
System.out.println(next);

	}
}
}

