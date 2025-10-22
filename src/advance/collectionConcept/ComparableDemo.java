package advance.collectionConcept;

import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
 
		Set set= new TreeSet();
		set.add(10);
		set.add(20);
		set.add(15);
	
		System.out.println(set);
		
		Set set2= new TreeSet();
		set2.add("Neha");
		set2.add("yana");
		set2.add("jhony");
		
		System.out.println(set2);
	
		Student s1= new Student();
		s1.setId(101);
		s1.setName("Neha");
		s1.setAge(5);
		
		Student s2= new Student();
		s2.setId(102);
		s2.setName("yana");
		s2.setAge(9);
		
		Student s3= new Student();
		s3.setId(103);
		s3.setName("jhony");
		s3.setAge(7);
		
		Set set3= new TreeSet();
		set3.add(s1);
		set3.add(s2);
		set3.add(s3);
		
		System.out.println(set3);
	}

}
