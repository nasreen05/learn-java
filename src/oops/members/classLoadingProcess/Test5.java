package oops.members.classLoadingProcess;

public class Test5 {
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
        static int a;
        static{
            System.out.println(a);
            a=17;
        }
        public static void test (){
            a++;
        }
        public static void main( String[] args ){
            System.out.println(a);
        }
        static {
            System.out.println(a);
            test();


        }
    }
