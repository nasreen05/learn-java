	package oops.inheritancePrograms;

    import oops.inheritancePrograms.Dog;

    public class DogRunner {

		    public static void main(String[] args) {
		        oops.inheritancePrograms.Dog dog = new Dog();
		        dog.setName("golden Retrive");
		        System.out.println("Dog name is : " + dog.getName());
		        dog.setSound("bark");
		        System.out.println(dog.getSound());
		        dog.setNoOfLegs(4);
		        System.out.println(dog.getNoOfLegs());
		        
		    }
	}
		        
		        
		        
		        
		        
		        
		        
		        
		        

		     /*   Dog dog1 = new Dog();
		        dog1.setIsTrained(true);
		        System.out.println("Dog  is trained : " + dog1.getIsTrained());

		        Dog dog2 = new Dog();
		        dog2.setBreed("Labrador");
		        // dog2.sound(); // (method overriding)
		        System.out.println("Dog breed is : " + dog2.getBreed());
		    }
		}
*/