package Inheritance;

import xworkz.inheritance.heriarchical.Animal;

public class Dog  extends Animal {

	    private String breed;
	    private boolean isTrained;

	   /* public void sound(){
	        System.out.println("Animal makes sounds"); //(method overriding)
	    }

	    */

	    public void setBreed(String breed){
	        this.breed=breed;
	    }
	    public  void setIsTrained(boolean isTrained){
	        this.isTrained=isTrained;
	    }

	    public String getBreed(){
	        return breed;
	    }

	    public boolean getIsTrained(){
	        return isTrained;
	    }

	}


