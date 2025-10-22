package advance.iteratorConcept;

import java.util.Enumeration;
import java.util.Vector;

public class EnamurationDemo {

	public static void main(String[] args) {
		Vector<Integer> arr=new Vector();
		arr.add(201);
		arr.add(202);
		arr.add(203);
		arr.add(204);
		
		Enumeration<Integer> elements= arr.elements();
		
		while(elements.hasMoreElements()) {
			Integer nextElement= elements.nextElement();
			System.out.println(nextElement);
			
		}
		
		
		

	}

}
