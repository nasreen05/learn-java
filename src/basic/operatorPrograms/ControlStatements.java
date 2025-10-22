package basic.operatorPrograms;/*-----------------------> IF STATEMENTS <--------------------

class ControlStatements {
	public static void main(String[] args) {
		System.out.println("welcome sir");
		System.out.println("hi sir");
		if(false){
			System.out.println("Thank you  sir");
		}
		System.out.println("bye sir");
	}
}
//welcome sir
// hi sir
//bye sir 
*/


/*--------------------->EXAMPLE --2 <------------------
class ControlStatements {
	public static void main(String[] args) {
		System.out.println("welcome to the ATM");
		int pin=1122;
		int apin=1122;
		if(pin==apin){
			System.out.println("Allow for withdraw");
		}
		System.out.println("Thank You ");
	}
} */

/*------------------------> IF-ELSE STATEMENTS <-------------------
class ControlStatements {
	public static void main(String[] args) {
		System.out.println("welcome to the ATM");
		int pin=1122;
		int apin=1122;
		if(pin==apin){
			System.out.println("Allow for withdraw");
		}else{
			System.out.println("Invalid pin , try again");
		}
		System.out.println("Thank You ");
	}
} */

/*------------------------>EXAMPLE--2 <----------------------
class ControlStatements {
	public static void main(String[] args) {
		int age=12;
		if(age>=21){
			System.out.println("You are eligible for driving");
		}else{
			System.out.println("You are not eligible for driving");
		}
		}
	} */


	/*------------------------>NESTED-IF-ELSE <----------------------
class ControlStatements {
	public static void main(String[] args) {
		System.out.println("welcome to ATM");
		int pin=1122;
		int apin=1122;
		if(pin==apin){
			System.out.println("Allow for withdraw");
	          int amt=100000;
	          int balance=5000;
	          if(amt<=balance){
			System.out.println("withdraw successful");
		}else{
			System.out.println("withdraw unsuccessful");
		}
	}else{
		System.out.println("Invalid pin,try again");
		}
		System.out.println("Thank you");
	}
	} */


/*------------------------>NESTED-IF-ELSE <----------------------

class ControlStatements {
	public static void main(String[] args) {
		System.out.println("welcome to ATM");
		int pin=1242;
		int apin=1122;
		if(pin==apin){
			System.out.println("Allow for withdraw");
	          int amt=10000;
	          int balance=5000;
	          if(amt<=balance){
			System.out.println("withdraw successful");
		}else{
			System.out.println("withdraw unsuccessful");
		}
	}else{
		System.out.println("Invalid pin,try again");
		}
		System.out.println("Thank you");
	}
	} //welcome to ATM
	//Allow for withdraw
	//withdraw unsuccessful
	//Thank you */


/*------------------> Ladder if else if <-----------------------

class ControlStatements {
	public static void main(String[] args) {

		System.out.println("==============GREAD SYSTEM===============");
		
		int marks =5;
		if(marks++>= 25 && marks <40){
          System.out.println("Grade is D");
		
		}if(marks++>= 40 && marks <60){
          System.out.println("Grade is C");
		
		}if(marks++>= 60 && marks <80){
          System.out.println("Grade is B");
		
		}if(marks++>= 80 && marks <90){
          System.out.println("Grade is A");
		
		}if(marks++>= 90 && marks <100){
          System.out.println("Grade is A++");
      
        }if(marks++<25){
      	System.out.println("Failed ,try next year");
      }
        System.out.println("your marks is" +marks);	
		}

	} 
	// =================GRAND SYSTEM==============
	// faild , try again
	// your marks is 11 */


/*------------------> SWITCH CASE <-----------------------*/


class ControlStatements {
	public static void main(String[] args) {
    int button=1;
     switch (button){
     	case 1 :System.out.println("withdraw function");
     	break;
     	case 2 :System.out.println("balance check");
     	break;
     	case 3 :System.out.println("deposit function");
     	break;
        default:System.out.println("wrong choice");
     }
   }
}
//withdraw Function










     





















































