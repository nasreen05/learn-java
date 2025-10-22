package advance.exceptionConcept;

public class MultiCatchBlockDemo {

	public static void main(String[] args) {
		

		   int i,j,k;
		   i=10;
		   j=2;
		   
		   try {
			 k=i/j;     //Arithmetic
			 
			   System.out.println("result: "+k);
			  
			   int[] arr = new int[6];
			   arr[k]=50;  //ArrayIndexOfBoundEception
			   
			   System.out.println("Index value :"+arr[k]); //50
			 
			   String name=null;
			   name.concat("Nasreen");  //NullPointerException
			   
		 			   
		   }catch (ArithmeticException e){
			   System.out.println("0 cannot be devided...");
			   e.printStackTrace();
			   
			   
		   }catch (ArrayIndexOutOfBoundsException e) {
			   e.printStackTrace();
		   }
		      catch(Exception e) {
				System.out.println("General catch block executes..");
			}   
			   		

		//   Exception e= new  NullPointerException();
		   }   
	}

		 /*  finally {
				System.out.println("important code....");
		   }
		   
		   System.out.println("Program end");*/
	
