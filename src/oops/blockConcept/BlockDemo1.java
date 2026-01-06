package oops.blockConcept;

public class BlockDemo1 {
    static  int i;
    int j;
    static {
        System.out.println(" static method executed");
        i=10;
    }
    {
        System.out.println("non- static method executed");
        j=20;
    }

    public static void main(String[] args) {
        System.out.println("main method executed");
        System.out.println("static block"+BlockDemo1.i);
        BlockDemo1 b1= new BlockDemo1();
        System.out.println("non static block"+b1.j);

    }
}
