package Polymorphism;

class Calaculator{
    public int add( int a , int b ){
        return a+b;
    }
    public int add(int a , int b , int c){
        return a+b+c;
        }
        public  double add(double a , double b){
        return a+b;
        }

    }

    class Loan{
  public double calculatorInterset(double amount, double rate) {
    return (amount * rate / 100);
  }

  public double calculatorInterset(double amount, double rate, int year) {
    return (amount * rate * year) / 100;
  }
}

public class LoanRunner {
public static void main(String[] args){
    Loan loan= new Loan();
    double  interset=loan.calculatorInterset(2000d,2.5);
    System.out.println("Interset for 1 yr of 10000 amount is"+interset);
    double  interset1=loan.calculatorInterset(2000d,2.5,6);
    System.out.println("Interset for 1 yr of 10000 amount is"+interset1);


    }
}
