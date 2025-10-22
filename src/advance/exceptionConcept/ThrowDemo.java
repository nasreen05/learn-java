package advance.exceptionConcept;

public class ThrowDemo {
	static int m1(int a, int b) {
		if(a!=0) {
			return a/b;
			
		}else {
			throw new ArithmeticException("0 can't be devided");
			
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Program starts..");
		int num=m1(10,0);
		
		System.out.println(num);
		System.out.println("Program end..");
	

	}

}
