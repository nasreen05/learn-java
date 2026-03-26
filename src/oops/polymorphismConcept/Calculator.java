package oops.polymorphismConcept;

public class Calculator {
    public static void add( int a, int b){
        System.out.println("add a & b");
    }
    public static void add( int a, int b, int c){
        System.out.println("Add a & b & c");
    }
    public static void add( int a, int b, int c, int d){
        System.out.println(" Add a & b & c & d");
}

    public static void main(String[] args) {
        add(12, 12);
        add(12, 12, 13);
        add(12, 21, 12, 12);
    }
    }