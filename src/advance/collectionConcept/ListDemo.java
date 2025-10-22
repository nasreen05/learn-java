package advance.collectionConcept;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>  arrList= new ArrayList<Integer>();
		arrList.add(100);
		arrList.add(200);
		arrList.add(300);
		arrList.add(400);
		System.out.println(arrList);

		List<Integer> linkList = new LinkedList<Integer>();
		linkList.add(100);
		linkList.add(200);
		linkList.add(300);
		linkList.add(400);
		
		System.out.println(linkList);
		
		
	}

}
