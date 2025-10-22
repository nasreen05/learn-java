package Multiple_Inherit_InterfaceProgram;

    class Add implements Calculator {
        @Override
        public void operation(int a, int b) {
            System.out.println("Addition: " + (a + b));
        }
    }