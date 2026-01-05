package InterfaceTask;
class Sub implements Calculator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}