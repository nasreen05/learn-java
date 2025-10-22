package advance.iteratorConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {

	private static Object listIterator;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr= new ArrayList<Integer>();

		arr.add(201);
		arr.add(202);
		arr.add(203);
		arr.add(204);

		ListIterator<Integer> listIterator=arr.listIterator();
		
		
        System.out.println("========forward direction=========");
		while(listIterator.hasNext()) {
		Integer next=  listIterator.next();
		System.out.println(next);
	
		
}
		System.out.println("========Backward  direction=========");
		while(listIterator.hasPrevious()) {
		Integer next=  listIterator.previous();
		System.out.println(next);
}
}
}

