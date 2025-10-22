package Polymorphism;

class Animal1 {
  public String food;

  Animal1() {

  }

  Animal1(String food) {
    this.food = food;
  }
    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog1 extends Animal1 {
    Dog1(){

    }
    Dog1(String  food){
        super(food);
    }
    public void eat(){
        System.out.println("Animal eats food"+food);
    }
}

class Cat1 extends Animal1{
Cat1(){
}
Cat1(String food){
    super(food);
}
public void eat(){
    System.out.println("Animal eats food"+food);
}
}


class  Elephant1 extends  Animal1{
Elephant1(){
}
Elephant1(String food){
    super(food);
}
public void eat(){
    System.out.println("Animal eat food"+food );
}
}


public class AllAnimalRunner {
    public static void main(String[] args){

        Animal1  dog= new Dog1("Pedigree");
        System.out.println("Dog eat food " + dog.food);
           dog.eat();

        Animal1 cat = new Cat1("Purina");
        System.out.println("Cat eat food " + cat.food);
             cat.eat();

        Animal1 elephant= new Elephant1("Royel canin");
        System.out.println("Elephant eat food:"+elephant.food);
        elephant.eat();
    }
    }
