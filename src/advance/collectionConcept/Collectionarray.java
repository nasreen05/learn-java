package advance.collectionConcept;

import java.util.ArrayList;
import java.util.Collection;


public class Collectionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers  = new  int[4];
		numbers[0]=50;
		numbers[1]=51;
		numbers[2]=52;
		numbers[3]=53;
		// numbers[5]="Neha";
		
		System.out.println("In array");
		for(int i=0; i< numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("In Collection ");
		
		Collection col= new ArrayList();
		col.add(101);
		col.add(102);
		col.add(103);
		
		System.out.println(col);
		

	}

}
