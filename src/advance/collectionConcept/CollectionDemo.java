package advance.collectionConcept;

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
		
		System.out.println(c);*/

	}

}
