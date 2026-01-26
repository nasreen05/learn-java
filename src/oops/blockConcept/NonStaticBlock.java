package oops.blockConcept;

public class NonStaticBlock {
    static int count;
    NonStaticBlock(){
        System.out.println("Constructor() executed");
    }
    NonStaticBlock(int i){
        System.out.println("Constructor(int i) executed");
    }
    NonStaticBlock(int i, int j){
        System.out.println("Constructor(int i , int j) executed");
    }
    {
        System.out.println("Non Static block executed");
        count++;
    }

    public static void main(String[] args) {
        NonStaticBlock nb1=new NonStaticBlock();
        NonStaticBlock nb2=new NonStaticBlock(10);
        NonStaticBlock nb3=new NonStaticBlock(10,20);
        System.out.println("Total object created: "+count);
    }
}
