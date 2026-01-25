package oops.methodConcept.MemoryAllocation;

public class MemoryAllocation {
    static int i;
    int j;
    void m(){
        System.out.println("m() starts");
        int k=30;
        System.out.println(" i = "+i);
        System.out.println(" j = "+j);
        System.out.println("k = "+k);
        System.out.println("m() end");
    }
    public static  void main(String [] args){
        System.out.println("main () starts");
        MemoryAllocation ma = new MemoryAllocation();
        ma.m();
        System.out.println("main() end");

    }

}
