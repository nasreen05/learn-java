package advance.exceptionConcept;
class AgeNotValidException extends Exception{
	public AgeNotValidException(String msg) {
		super(msg);
		
	}
}

public class ThrowsDemo {
		
			static void fromFill() {
				System.out .println("Form is being fill up");
			}
			static boolean ageValidation(int a) throws AgeNotValidException{
				{
			}
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
					boolean res;
					try{
						res= ageValidation(20);
					}catch (AgeNotValidException e) {
						e.printStackTrace();
						
					}

			        generateLicense();
			        System.out.println("Program end....");
			     


	}

}
