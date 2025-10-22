package basic.operatorPrograms;/* class UnaryOP{
	public static void main(String[] args) {
		int a = 20;
		int b = 20;
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
	}
		

} */


 /* -----------------------> EXAMPLE --  2 <--------------------------

 class UnaryOP{
	public static void main(String[] args) {
		int a = 5;
		int b = 30;
		System.out.println(++a + a++);  // 12
		System.out.println(++b + ++b);   //63
	}
}

  */


/*--------------------> EXAMPLE -- 3 <-----------------------

class UnaryOP{
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a++ + b++);  // 20
		System.out.println(b++ + ++a );   //23
	}
}

*/

/*--------------------> SOME QUESTION  -- 1 <-----------------------

class UnaryOP{
    public static void main(String[] args) {
	

        int i = 11;
         
        i = i++ + ++i;        // 24
         
        System.out.println(i);
    }

} */

/*--------------------> SOME QUESTION  -- 2 <----------------------- 

class UnaryOP{
   public static void main(String[] args){
        int a=11, b=22, c;
         
        c = a + b + a++ + b++ + ++a + ++b;
         
        System.out.println("a="+a);   //3
        System.out.println("b="+b);   //24
        System.out.println("c="+c); // 103
    }


} */

/*--------------------> SOME QUESTION  -- 3  <----------------------- 

class UnaryOP{
   public static void main(String[] args){
      
        int i=0;
         
        i = i++ - --i + ++i - i--;
         
        System.out.println(i);  //0
         
    }
}   */

 
/*--------------------> SOME QUESTION  -- 4  <----------------------- 

class UnaryOP{
   public static void main(String[] args){
      
        int i=1, j=2, k=3;
         
        int m = i-- - j-- - k--;
         
        System.out.println("i="+i); //0
        System.out.println("j="+j); //1
        System.out.println("k="+k);  //2
        System.out.println("m="+m);  //4
    }
} */


/*--------------------> SOME QUESTION  -- 5 <----------------------- 

class UnaryOP{
   public static void main(String[] args){
       int a=1, b=2;
         
        System.out.println(--b - ++a + ++b - --a); //0
      
    }
} */


/*--------------------> SOME QUESTION  -- 6  <----------------------- 
class UnaryOP{
   public static void main(String[] args){
      int i=19, j=29, k;
         
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
         
        System.out.println("i="+i); //19
        System.out.println("j="+j); //29
        System.out.println("k="+k); //20
    }
} */


/*--------------------> SOME QUESTION  -- 7  <----------------------- 
class UnaryOP{
   public static void main(String[] args){
      int a=1;
         
        a = a++ + ++a * --a - a--;
         
        System.out.println(a);
    }
}  */


/*--------------------> SOME QUESTION  -- 8  <----------------------- 

class UnaryOP{
   public static void main(String[] args){
      int x = 001, y=010, z=100;
         
        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
         
        System.out.println("x="+x); //-2
        System.out.println("y="+y);  //11
        System.out.println("z="+z);  //98
        System.out.println("i="+i);  //-167
    } 
}  */

/*--------------------> SOME QUESTION  -- 9  <----------------------- */

class UnaryOP{
   public static void main(String[] args){
    int i = 0, j = 0;
         
        System.out.println(--i * i++ * ++j * j++);  //1
    }

}  


























































































