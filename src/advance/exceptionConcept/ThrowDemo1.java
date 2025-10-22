package advance.exceptionConcept;
 class AgeNotValidException extends RuntimeException{
	 private static String msg;

	 public AgeNotValidException(String age) {
		 super (msg);
		 
	 }
 }
public class ThrowDemo1 {
	static void fromFill() {
		System.out .println("Form is being fill up");
	}
	static boolean ageValidation(int a) {
		System.out.println("Age validation is processing ");
		if(a>=18) {
			System.out.println("Age is valid..");
			return true ;
		}else {
			throw new AgeNotValidException("Age is not   vaalided...");
			
		}
	}
	static  void generateLicense() {
		System.out.println("License generated....");
		
	}

	public static void main(String[] args) {
			System.out.println("Program starts..");
			fromFill();
			boolean res= ageValidation(20);
			System.out.println("Program end..");
	        generateLicense();
	        System.out.println("Program end....");
	        
	}

}
