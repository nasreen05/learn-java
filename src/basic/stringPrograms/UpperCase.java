package basic.stringPrograms;

public class UpperCase {
    public static void main(String[]args){
        String name= "Neha";
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
       name= name.toUpperCase();
        System.out.println(ustring);


        String nonTrimmedString="Neha";
        System.out.println(nonTrimmedString.trim());
        String trimeString = nonTrimmedString.trim();
        System.out.println(trimeString);

//name.trim()--> Return a new string after removing all the leading an d traling spaces from the origined String

    }
}
// Return a  new String which has all the lowercase characters from the String name
