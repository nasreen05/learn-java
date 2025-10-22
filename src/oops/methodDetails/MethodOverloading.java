package MethodDetails;

class Methcalculation {
  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

  double add(double a, double b, double c) {
    return a + b + c;
  }
}

public class MethodOverloading {
  public static void main(String[] args) {
    Methcalculation m1 = new Methcalculation();
   System.out.println("add:"+m1.add(20,30));
   System.out.println("add:"+m1.add(20,30,40));
   System.out.println("add:"+m1.add(2.5,3.5,6.7));
  }
}

