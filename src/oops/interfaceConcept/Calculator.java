package oops.interfaceConcept;

public abstract class Calculator implements  Add,Sub{
    @Override
    public int  add(int a , int b){
        return a+b;
       }
        @Override
        public int sub(int a , int b){
            return a-b;

        }

    public abstract void operation(int a, int b);
}

