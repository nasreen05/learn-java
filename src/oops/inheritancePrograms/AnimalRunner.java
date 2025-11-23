package oops.inheritancePrograms;

import oops.inheritancePrograms.Animal;

public class AnimalRunner {

	public static void main(String[] args) {
	
		Animal animal = new Animal();
		animal.setName("dog");
		System.out.println(animal.getName());
		animal.setSound("bark");
		System.out.println(animal.getSound());
		animal.setNoOfLegs(4);
		System.out.println(animal.getNoOfLegs());
		
		Animal animal1= new Animal();
		animal1.setName("cat");
		System.out.println(animal1.getName());
		animal1.setSound("meow");
		System.out.println(animal1.getSound());
		animal1.setNoOfLegs(4);
		System.out.println(animal.getNoOfLegs());
		
		
		Animal animal2 = new Animal();
		animal2.setName("horse");
		System.out.println(animal2.getName());
		animal2.setSound("Neigh");
		System.out.println(animal2.getSound());
		animal2.setNoOfLegs(4);
		System.out.println(animal2.getNoOfLegs());
		
		Animal animal3= new Animal();
		animal3.setName("Elephant");
		System.out.println(animal3.getName());
		animal3.setSound("Trumpet");
		System.out.println(animal3.getSound());
		animal3.setNoOfLegs(4);
		System.out.println(animal.getNoOfLegs());
		
		

	}

}
