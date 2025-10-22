package basic.operatorPrograms;/*----------------> AND OPERATOR <-------------------


class LogicalOP{
	public static void main(String[] args) {
	
		int age=19;
		int myage=21;
		System.out.println((age== myage) &(age>myage)); //false
          System.out.println((age==myage)&&(age >myage)); //false

      }
  } */


/*---------------------> AND OPERATOR EX--2 <-----------------

class LogicalOP{
	public static void main(String[] args) {
	
		int age=19;
		int myage=21;
		System.out.println((age== myage) &(++age >myage)); //false 
		System.out.println(age); //20
        System.out.println((age==myage)&&(age >myage++)); //false
        System.out.println(myage); //21
      }
  } */



/*----------------> OR OPERATOR <-------------------*/


class LogicalOP{
	public static void main(String[] args) {
	
		int age=19;
		int myage=21;
		System.out.println((age!= myage) |(++age>myage)); //true
		System.out.println(age); //20
          System.out.println((age!=myage)||(age >myage)); //true
          System.out.println(myage); //21

      }
  } 



























