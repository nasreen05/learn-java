package basic.controlStatement.decisionMakingStatement;

public class Personality {
    public static void main(String[] args){
        int age=21;
        if(age<2){
      System.out.println("Baby");
        }else if(age>=2 && age <=6){
      System.out.println("Children");
        }else if(age >=6 && age <=12){
      System.out.println("Younger");
        }else if(age >=12 && age <=20){
      System.out.println("Elder");
        }else if(age >=20  && age <=40){
      System.out.println("person");
        }else if(age >=40 && age<=80){
      System.out.println("Aged");
        }else{
      System.out.println("No Personality");
        }
    }
}
