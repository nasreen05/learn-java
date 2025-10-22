package oops.methodDetails.overloading;

class CeoRunner{
	public static void main(String[] args) {

     Ceo ceo =new Ceo("Reshma", 1234,"Bangalore");
     System.out.println(ceo.getName());
     System.out.println(ceo.getSalary());
     System.out.println(ceo.getcity());



	Ceo ceo1=new Ceo("Rafia",34567,"Kolkata");

     System.out.println(ceo1.getName());
     System.out.println(ceo1.getSalary());
     System.out.println(ceo1.getcity());
     

 }
}
