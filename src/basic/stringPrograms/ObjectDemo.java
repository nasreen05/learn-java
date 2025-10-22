package basic.stringPrograms;

public class ObjectDemo {

	public static void main(String[] args) {
		
	Student s1=new Student();
	s1.setId(101);
	s1.setName("Neha");
	
	Student s2=new Student();
	s2.setId(102);
	s2.setName("taeha");
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	
	System.out.println(s1.toString());
	System.out.println(s2.toString());

	System.out.println(s1.equals(s2));
	
	s1=null;
	s2=null;
	System.gc();
	
	System.out.println("Thank you");
	System.out.println("Bye");
	System.out.println("Program End");
	

	
	}

}
