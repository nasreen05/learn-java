package oops.constructorConcept.basicPrograms;
class Per{
    String name;
    int age;
    Per(){//user-define constructor
//initialize the instance /object and data member
    }
    void details(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}
public class TestPer {
    public static void main(String[] args) {
        Per per=new Per();
        per.details();
    }
}
