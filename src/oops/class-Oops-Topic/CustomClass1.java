package OOpsClassTopic;

class Teacher{
    int age;
    String  name;
    float rating;

}
public class CustomClass1 {
    public static void main(String[] args){
    System.out.println("This is Details Class");
    Teacher neha=new Teacher();
    neha.age=21;
    neha.name="Reshma Nasreen";
    neha.rating =34.5f;
    System.out.println(neha.age);
    System.out.println(neha.rating);
    System.out.println(neha.name);
    }
}
