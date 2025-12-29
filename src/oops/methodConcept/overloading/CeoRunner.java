package oops.methodConcept.overloading;

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

    static class Ceo{
        private String name;
        private float salary;
        private String city;

        public Ceo(String name, float salary, String city){
            this.name=name;
            this.salary=salary;;
            this.city=city;

    }
        public String getName(){
        return name;
    }
        public float getSalary(){
        return salary;
      }
      public String getcity(){
          return city;
      }
    }
}
