package Multiple_Inherit_InterfaceProgram;

interface Calculator {
    default void showInfo() {
        System.out.println("Default method inside Calculator interface");
    }

    void operation(int a, int b); // abstract method
}


