package oops.thisKeywordConcept;
class Dog{
    String name;
    int age;
    void details(){
        String name="Bull Dog";
        int age=90;
        this.name=name;
        this.age=age;
        System.out.println("this keyword pointing object -"+this);
        System.out.println("this.name"+this.name);
        System.out.println("this.age"+this.age);
        System.out.println("name"+name);
        System.out.println("age"+age);
    }

}
public class ThisKeyDemo {
    public static void main(String[] args) {
    Dog d1= new Dog();
    d1.details();
    System.out.println("===inside main====");
        System.out.println("d1 is pointing object"+d1);
        System.out.println("d1.name"+d1.name);
        System.out.println("d1.age"+d1.age);
    }
}
