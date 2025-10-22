package basic.operatorPrograms;/* --------EXAMPLE --1 -----------


class TernaryOP {
	public static void main(String[] args) {
		int age  =19;
		String start =(age>=21)?"you are eligible fo driving": "you are not  eligible for driving" ;
		System.out.println(start);
	}
}          */



class TernaryOP {
	public static void main(String[] args) {
		int num1 , num2;
		num1 =25;
		num2=(num1==10)?100 :200;
		num2=(num1==25)? 100:200;
		System.out.println("num2:"+num2); //100
		System.out.println("num1:"+num1); //25
	}
}   