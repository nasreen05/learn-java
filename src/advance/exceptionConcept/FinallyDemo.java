package advance.exceptionConcept;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Program started..");
   
   	
		   int i,j,k;
		   i=10;
		   j=2;
		   try {
			 k=i/j;
			 k=i/j;
			   System.out.println("result: "+k);
			  
			   int[] arr = new int[5];
			   arr[k]=50;  
			   
			   System.out.println("Index value :"+arr[k]); //50
			   
			   		
			   
		   }catch (ArithmeticException e){
			   System.out.println("0 cannot be devided...");
			   
		   }
		   finally {
				System.out.println("important code....");
		   }
		   
		   System.out.println("Program end");
		   
		   
	}
	
		
	}


