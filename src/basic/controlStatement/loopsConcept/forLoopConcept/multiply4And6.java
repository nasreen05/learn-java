package basic.controlStatement.loopsConcept.forLoopConcept;

public class multiply4And6 {
    public static void main(String[] args){
        for(int i=1;i<=50;i++){
            if(i%4==0 || i%6==0)
                continue;
            System.out.println(i+" ");
            }
        }
    }

