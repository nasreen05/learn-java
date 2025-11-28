package advance.collectionConcept.vectorConcept;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
Vector  v = new Vector();
v.add(10);
v.add(20);
v.add(30);
v.add(40);

Iterator<Integer> iterator= v.iterator();

iterator.hasNext();
while(iterator.hasNext() ) {
	Object next = iterator.next();
	
	Integer i= (Integer) next;
	int intValue=i.intValue();
	
	System.out.println(intValue);
	
}
	}

}
