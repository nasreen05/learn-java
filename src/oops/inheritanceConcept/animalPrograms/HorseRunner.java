package oops.inheritanceConcept.animalPrograms;

public class HorseRunner {

	public static void main(String[] args) {
		
		Horse horse= new Horse();
		horse.setName("Eclipse");
		System.out.println(horse.getName());
        horse.setSound("Neight");
        horse.setNoOfLegs(4);
        System.out.println(horse.getSound());
        System.out.println(horse.getNoOfLegs());
	}

}
