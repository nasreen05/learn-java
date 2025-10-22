package OOpsClassTopic;


class  Employee1{
    int id;
    String name;
    int salary;


    public int getSalary(){
        return salary;
    }
    public String getName(){
        return  name;

    }
    public void setName(String n){
        name = n;
    }
}
public class CustomerDetails {
    public static void main(String[] args){
        Employee1 neha=new Employee1();
        neha.salary=234;
    System.out.println(neha.getSalary());
        neha.setName("Coder Neha");
        neha.getName();
    System.out.println(neha.getName());
    }
}
