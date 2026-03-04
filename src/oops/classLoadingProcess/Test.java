package oops.classLoadingProcess;

public class Test {
    static int a;

    public static void test() {
        System.out.println("Test()");
    }
    static {
        System.out.println("SIB");
    }

    public static void main(String[] args) {
        System.out.println(a);
        test();
    }
    }

