package Inheritance;

import xworkz.inheritance.heriarchical.Eleghant;

public class EleghantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		xworkz.inheritance.heriarchical.Eleghant eleghant = new Eleghant();
		eleghant.setName("Arjuna");
		System.out.println(eleghant.getName());
        eleghant.setSound("Trumpet");
        eleghant.setNoOfLegs(4);
        System.out.println(eleghant.getSound());
        System.out.println(eleghant.getNoOfLegs());
		
	}

}
