package basic.operatorPrograms;/*--------------->AND OPERATOR <------------------------

class BitwiseOP {
	public static void main(String[] args) {
		int bill=50000;
		int withdraw =10000;
		int pin=2345;
		int mpin=2346;

		boolean neha =((pin ==mpin) &(bill<withdraw)); // false
		boolean neha2=((pin ==mpin) &(bill>withdraw)); //false
		
		System.out.println(neha);
		System.out.println(neha2);
	}
} */


/*--------------->OR OPERATOR <------------------------ 
class BitwiseOP {
	public static void main(String[] args) {
		int bill=50000;
		int withdraw =10000;
		int pin=2345;
		int mpin=2346;
        boolean neha =((pin ==mpin) |(bill>=withdraw)); // true
		boolean neha2 =((pin ==mpin) |(bill<=withdraw)); // false
		boolean neha3 =((pin != mpin) |(bill== withdraw)); // true 
		System.out.println(neha);
		System.out.println(neha2);
		System.out.println(neha3);
	}
} */


/*--------------->XOR OPERATOR <------------------------ */
class BitwiseOP {
	public static void main(String[] args) {
		int bill=50000;
		int withdraw =10000;
		int pin=2345;
		int mpin=2346;
       
		boolean neha1 =((pin !=mpin) ^(bill<withdraw)); // true
		boolean neha2 =((pin != mpin) ^ (bill> withdraw)); // false 
		System.out.println(neha1);
		System.out.println(neha2);
		
	}
}

























