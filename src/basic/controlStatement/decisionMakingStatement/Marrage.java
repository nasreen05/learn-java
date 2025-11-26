package basic.controlStatement.decisionMakingStatement;

public class Marrage {
    public static void main(String[] args){
        int age=19;
        if(age>18){
            System.out.println("Allow for vote");
            if(age>20){
                System.out.println("Allow for marrageWedding");
            }else {
                System.out.println("Not allow for marrageWedding");
            }
        }else{
            System.out.println("not allow for vote");
        }
    }
}

