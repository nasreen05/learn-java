package oops.members.classLoadingProcess;

public class Test4 {
// Online Java Compiler
// Use this editor to write, compile and run your Java code online


        static int a;
        static {
            System.out.println(a);
            a=test(21);

        }
        public static int test(int b){
            return b+4;

        }
        public static void main(String[] args) {
            System.out.println(a);
        }
    }
