package basic.stringPrograms;

public class ReplacePro {
    public static void main(String[] args){

        String name= "Neha";
        System.out.println( name.replace( 'N', 'A'));
        System.out.println(name.replace("Neha","Arif"));

        System.out.println(name.startsWith("N"));
        System.out.println(name.endsWith("f"));


    }
}
// name.startsWith("Ne") --> returns true if name starts with string "Ha" true in this case

//name.endswith("ha")--> returns true if name ends with staring "ry" true is the case;


