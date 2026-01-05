package InterfaceTask;
class Add implements Calculator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }
}