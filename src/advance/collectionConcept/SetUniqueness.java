package advance.collectionConcept;

import java.util.HashSet;
import java.util.Set;

public class SetUniqueness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st1= new Student();
st1.setId(101);
st1.setName("Neha");
st1.setAge(20);

Student st2=new Student();
st2.setId(102);
st2.setName("Rokeya");
st2.setAge(22);

Student st3=new Student();
st3.setId(101);
st3.setName("Neha");
st3.setAge(20);

System.out.println(st1.equals(st3));

Set hs=new HashSet();
hs.add(st1);
hs.add(st2);
hs.add(st3);

System.out.println(hs);

	}

}
