package oops.interfaceConcept;

public class Calculator implements  Add,Sub{
    @Override
    public int  add(int a , int b){
        return a+b;
       }
        @Override
        public int sub(int a , int b){
            return a-b;

        }
    }

