package oops.constructorConcept.basicPrograms;

class Person{
    String name;
    int age;
    Person(){// user-define constructor
//Initialization the instance / object and data member
        name=null;
        age=0;
    }
    void printDetails(){
        System.out.println("Name"+name);
        System.out.println("Age :"+age);
    }
}
//====After Compilation=================
/* class  Person{
String name;
int age;
Person(){// default constructor
//Initialization the instance / object and data member
name=null;
age=0;
}
void printDetails(){
System.out.println("Name"+name)
System.out.println("age :"+age)
 }
 }
 */

public class TestPerson {
    public static void main(String[] args) {
        Person person =new Person();
        person.printDetails();
    }
}
