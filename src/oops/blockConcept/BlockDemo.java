package oops.blockConcept;

public class BlockDemo {
    static int i;
    int j;
    static {
        System.out.println("static block executed");
        i=10;

    }
    {
        System.out.println("non-static block executed ");
        j=20;

    }
    public static void main(String[] args) {
        System.out.println("main method executed");
        System.out.println("static i "+BlockDemo.i);
        BlockDemo db= new BlockDemo();
        System.out.println(" non-static db"+db.j);
    }
}
