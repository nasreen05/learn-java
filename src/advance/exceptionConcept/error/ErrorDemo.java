package advance.exceptionConcept.error;

public class ErrorDemo {
	static void m1(int no) {

			System.out.println("m1 method starts");
			if(no<5) {
				m1(no+1);
				
			}			
			
			System.out.println("m1 method end");
			
		}
	public static void main(String[] args) {
		System.out.println("Program starts..");		
	m1(1);
	System.out.println("Program end ...");
	
	}

}
