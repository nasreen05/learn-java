package basic.stringPrograms;

public class WapperDemo {

	public static void main(String[] args) {
	
		int  i = 10;
		
		Integer integer = new Integer(i);      //primitive to object------->
		
		System.out.println(integer);
		
		int intValue= integer.intValue();     //Object to primitive---------------->
		
		System.out.println(intValue);
		
		int j=20;	
		
		Integer obj=j;              //Auto boking 
		System.out.println(obj); 
		
		int obj2 = obj;              //Auto unboking
		System.out.println(obj2);
		
		
		
		
		

	}

}
