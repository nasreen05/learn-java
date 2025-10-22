package MethodDetails;
/* sometimes our program grows in sinze and we want to  separate of main method to other method
for Instance->

Calling Method--> a Method can be called by creating  an object of the class in which the method existing followed by the method call:

Cal obj= new Calc()--> object Creation obj.mySum(a,b); --> Method call upon an object
--> the value from the method call (a and b) are copied to the a and b of the function  mysum trues even if
we modify the values a and b inside the method , the values  in the maian  method will not change;

 */
/* the value  from the method call(a and b) are copied to the a and b of the function from mmysum .
 thus even if we modify the value  in the main method will not change.
 */
public class BasicMethod {
        static int logic(int x , int y){
            int z;
            if(x>y){
                z=x+y;
                }
            else{
                z=(x+y)*5;
                }
            return z;

            }

        public static void main(String[] args){
   int a=9;
   int b=8;
   int c=6;
   // Method invcation using object creation
   // BasicMethod obj= new BasicMethod();
   // c=obj.logic(a,b)
   c=logic(a,b);
    System.out.println(a+" "+b);
   int a1=9;
   int b1=34;
   int c1=98;
   c1=logic(a1,b1);
 /*   if(a1>b1){
       c1=a1+b1;
       }
   else {
       c1=(a1+b1)*5;

   } */
    System.out.println(c);
    System.out.println(c1);
  }
}
