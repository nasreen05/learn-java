package TechnicalPrograms;

public class SubWith {
  public static void main(String[] args) {

     int a=7;
     int b=5;
     int c;

     while(b!=0){
         c=(~a)&b;
         a=a^b;
         b=c<<1;
      }
    System.out.println(a);
  }
}
