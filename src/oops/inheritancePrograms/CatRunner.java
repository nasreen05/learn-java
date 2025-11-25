package oops.inheritancePrograms;

public class CatRunner {

	public static void main(String[] args) {
		oops.inheritancePrograms.Cat cat= new Cat();
		cat.setName("White cat");
        System.out.println("Meow");
        cat.setSound("Meow");
        cat.setNoOfLegs(4);
	    System.out.println(cat.getSound());
	    System.out.println(cat.getNoOfLegs());
	
	}

}
