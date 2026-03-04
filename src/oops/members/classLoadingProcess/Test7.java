package oops.members.classLoadingProcess;

public class Test7 {
    static {
        System.out.println("SIB-1");
    }
    static {
        System.out.println("SIB -3");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
    static {
        System.out.println("SIB -2");

    }
}
