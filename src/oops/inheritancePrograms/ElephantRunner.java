package Inheritance;

import xworkz.inheritance.heriarchical.Elephant;

public class ElephantRunner {

	public static void main(String[] args) {
		
		xworkz.inheritance.heriarchical.Elephant elephant= new Elephant();
		elephant.setName("Arjuna");
		System.out.println(elephant.getName());
        elephant.setSound("Trumpet");
        elephant.setNoOfLegs(4);
        System.out.println(elephant.getSound());
        System.out.println(elephant.getNoOfLegs());
	}

}
