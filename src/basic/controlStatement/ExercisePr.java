package basic.controlStatement;

public class ExercisePr {
    public static void main(String[]args){
        int a= 10;
        int b=a++;
       /* System.out.println(a);
        System.out.println(b);*/

        int c= ++a;
      /*  System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/
        a= a++ + ++b + c++;

     b=b++ + ++c + a++;
        c=c++ + ++a + b++;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
