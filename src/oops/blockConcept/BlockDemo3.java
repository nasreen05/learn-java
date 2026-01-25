package oops.blockConcept;

public class BlockDemo3 {
    static int i;
    int j;
    static { //static block
        //initialize the static member irrespective use of any method or class level or  method loadingsout
        System.out.println("static block executed");
        i=10;
        System.out.println(" i ="+i);
    }
    static {
        System.out.println("static block 2 executed");
        i=20;
        System.out.println("i ="+i);
    }
    public static void main(String[] args){
        System.out.println("main() executed");
        System.out.println("i = "+i);
    }
}
// can i run a  program without main method ?
// = yes with the help of static block , but after jdk 1.6 main method must be present in your class