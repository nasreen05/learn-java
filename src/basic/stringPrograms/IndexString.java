package basic.stringPrograms;

public class IndexString {
    public static void main(String[]args){

        String modifiedName="Nehaif";

        System.out.println(modifiedName.indexOf("ha"));
        System.out.println(modifiedName.lastIndexOf("h"));
        System.out.println(modifiedName.lastIndexOf("h",2));
        System.out.println(modifiedName.lastIndexOf(2,4));
    }
}

/* name.indexOF()--> Returns the index of the given String str
 fro ex: name.indexOf("ar") returns  1 which is the foirst occu rence of ar in  string "Neha", -1 otherwise*/

/* name.indexOf("h",3)--> Returns the index of the given string Starting from the index 3(int) . -1 is returnded in this case
 */

/* name.indexOf("a")-->returns the last index of the given String 3 in this case*/

// name.lastIndexOf("r",2)--> returns the lastr index of the given String before index 2

// name.equals("Harry")--> returns true if the given String is



















