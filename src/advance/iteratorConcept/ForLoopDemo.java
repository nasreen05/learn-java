package advance.iteratorConcept;

import java.util.ArrayList;

public class ForLoopDemo {

	public static void main(String[] args) {
	
		ArrayList<Integer>arr= new ArrayList();
		arr.add(201);
		arr.add(202);
		arr.add(203);
		arr.add(204);
		
		
		Object[] array =arr.toArray();
		
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
			
		}
				
	}

}
