package Interface_OPPs;

public class CalculatorRunner {
    public static void main(String[] args){



    Calculator  calculator= new Calculator();
    int result= calculator.add(10, 20);
    System.out.println(result);
    System.out.println(calculator.add(10,20));

    Add add =new Calculator();
    System.out.println(add.add(30,20));
    // System.out.println(add.add(30,20));

    Sub sub= new Calculator();
    System.out.println(sub.sub(30,20));
    System.out.println(sub.add(30,20));
}
}

