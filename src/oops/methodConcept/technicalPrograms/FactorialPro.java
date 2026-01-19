package oops.methodConcept.technicalPrograms;
class Fact{
    static int getFact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact *=i;
        }
        return  fact;
    }
}
public class FactorialPro {
    public static void main(String[] args) {
        int result= Fact.getFact(5);
        System.out.println(result);
    }
}
