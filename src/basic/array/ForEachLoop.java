package basic.array;


/*  array elements can also be reaversed as follows:

 for( int element : Arr) {
 sout(element) ; --> Prints all the elements
 }

 */
public class ForEachLoop {
    public static void main(String[] args){

        int [] marks={34,56,78,89,90};
        System.out.println("Printing using for-each loop");

     for(int element : marks){
      System.out.println(element);
        }
    }
}
