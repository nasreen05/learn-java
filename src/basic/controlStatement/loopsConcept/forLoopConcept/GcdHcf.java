package basic.controlStatement.loopsConcept.forLoopConcept;

public class GcdHcf {
    public static void main(String[] args){
       // Greater counter  devisor
        // Highest counter Factor
     int a=36;
     int b=60;
     int gcd=1;

     for(int i=1;i<=a && i<=b;i++){
         if(a%i==0 && b%i==0){
             gcd=i;
         }
     }
    System.out.println("gcd" + gcd);
    }
}
