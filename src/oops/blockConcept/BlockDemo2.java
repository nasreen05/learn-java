package oops.blockConcept;

public class BlockDemo2 {
    static int i;
    int j;
    static { // at the time of class loading , one=ly once
        System.out.println("static block executed");
        System.out.println(i);
        i=10;

    }
    BlockDemo2(){
        System.out.println("constructor executed ");
        System.out.println(j);
        j=30;
    }
    { // at the time of object before constructor , multiple time , as many object create
        System.out.println("non static block");// 3
        j=20;

    }
    static { // at the time of class loading , one=ly once
        System.out.println("static block executed");
        System.out.println(i);
        i = 10;
    }

    public static void main(String[] args) {
        System.out.println("Main Block executed");

        System.out.println(BlockDemo2.i);
        BlockDemo2 b1=new BlockDemo2();
        System.out.println(b1.j);
    }
}
