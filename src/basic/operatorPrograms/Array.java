package basic.operatorPrograms;/*-------------------> ARRAY- PROGRAM  <----------------------

class Array {
public static void main(String[] args) {
		int[] rollNo ={101,102,103};
		System.out.println(rollNo[0]);
		System.out.println(rollNo[1]);
		System.out.println(rollNo[2]);
	}	
} */



/*-------------------> ARRAY- PROGRAM  <----------------------

class Array {
public static void main(String[] args) {
		int[] rollNo =new int[3];
		rollNo[0]=101;
		rollNo[1]=102;
		rollNo[2]=103;
		for(int i=0;i<rollNo.length;i++){
		System.out.println(rollNo[i]);
		}	
} 

}   */

/*-------------------> ARRAY- PROGRAM  <----------------------*/

class Array {
public static void main(String[] args) {
		int[] rollNo =new int[3];
        System.out.println("Array without value");
        for(int i=1;i< rollNo.length;i++){
		System.out.println(rollNo[i]);
        }
		rollNo[0]=101;
		rollNo[1]=102;
		rollNo[2]=103;
		  System.out.println("Array without value");
        for(int i=1;i< rollNo.length;i++){
		System.out.println(rollNo[i]);
		}	
} 

}
 //Array without value

//0
//0

//Array without value
//102
//103


































