package advance.collectionConcept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set hashSet= new HashSet();    //No order
		hashSet.add(101);
		hashSet.add(108);
		hashSet.add(106);
		hashSet.add(109);
		hashSet.add("A");
		
		System.out.println(hashSet);
		
		Set ls= new LinkedHashSet();      //preserve insertion order
		ls.add(10);
		ls.add(20);
		ls.add(8);
		
		System.out.println(ls);
		
		Set ts= new TreeSet();     //ASC or DSC order
		
		ts.add(30);
		ts.add(20);
		ts.add(10);
		ts.add(5);
		ts.add(20);
		
		System.out.println(ts);
		

	}

}
