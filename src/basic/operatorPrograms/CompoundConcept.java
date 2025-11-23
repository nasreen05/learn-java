package basic.operatorPrograms;

public class CompoundConcept {
    public static void main(String[] args){
        // performance arithmetic or bitwise or shift operator  along with type casting
       byte a=10;
       a=(byte)(a+2);//byte +int = int
       a+=2;//internally it will perform arithemtic  and type casting
    System.out.println(a);
    }
}
