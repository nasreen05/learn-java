package basic.controlStatement.loopsConcept.whileLoopConcept;

public class FibonanciSeries {
    public static void main(String[] args){
        int f=1, r=0,s;
        int i=1;
        while(i<=10){
            s=f+r;
            f=r;
            r=s;
      System.out.println(s);
      i++;
        }
    }
}
