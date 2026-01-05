package ClassTypeCasting;

 class Laptop{
    public String name;


}
class Lenevo extends  Laptop{

}
class  Dell extends Laptop{

}

public class LaptopRunner {
  public static void main(String[] args) {

    Laptop laptop = new Dell();
    Laptop laptop1 = new Lenevo();

    System.out.println(laptop.name);
    System.out.println(laptop1.name);

    if (laptop1 instanceof Lenevo) {
      Lenevo lenevo = (Lenevo) laptop1;
      System.out.println("object is lenovo");
    }
    if (laptop instanceof Dell) {
      Dell dell = (Dell) laptop;
      // explicit casting
      System.out.println("Object is Dell");
    }
  }
        }