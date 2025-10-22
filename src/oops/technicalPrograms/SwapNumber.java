package TechnicalPrograms;

 class SwapNumber {

     public static void main(String[] agrs) {
         int a = 10;
         int b = 20;
         int c=a+b;
         System.out.println("Before swap");
         System.out.println("a=" + a);
         System.out.println("b=" + b);

//  int c=a+b;
//  a=c-a;
//  b=c-b;

         c = a + b;
         b = a - b;
         a = a - b;
         System.out.println("After  swap");
         System.out.println("a=" + a);
         System.out.println("b=" + b);
     }
 }
