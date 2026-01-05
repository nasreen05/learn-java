package InterfaceTask;

public class CalculatorRunner {
    public static void main(String[] args) {
        // Using interface reference for abstraction
        Calculator calc;

        calc = new Add();   // reference to Add
        calc.calculate(20, 10);

        calc = new Sub();   // reference to Sub
        calc.calculate(20, 10);
    }
}

