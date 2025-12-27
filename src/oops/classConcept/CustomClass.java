package OOpsClassTopic;

// In  one java file  only u have to  crete one public class

class Employee{
    int id;
String name;
public void printDetails(){
    System.out.println("My id is "+id);
    System.out.println("My name is"+name);
}

}
public class CustomClass {
    public static void main(String[] args){
    System.out.println("This is custom class");
    Employee neha= new Employee();// Instantiating a new Employee object
        Employee jhon= new Employee();
        //Setting Attributes
    neha.id=12;
    neha.name="CodeWithNeha";
    //Priting the property / attributes

jhon.id=23;
jhon.name="codeWithJhone";

        neha.printDetails();
        jhon.printDetails();
 //   System.out.println(neha.id);
   //  System.out.println(neha.name);
    }
}
