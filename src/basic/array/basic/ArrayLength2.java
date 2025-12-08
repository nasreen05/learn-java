package basic.array.basic;


// An array can be displayed using a for loop :

/* for(int i =0 ; i<marks.length ; i++)
{
sout(marks[i]);--> array traversal
}
 */

public class ArrayLength2 {
    public static void main(String[] args){
        int []marks={90,98,87,76,65};

    // System.out.println(marks.length);

    // Display the Array (Naive way)
    System.out.println("Printing using for loop");
            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);
            System.out.println(marks[3]);
            System.out.println(marks[4]);

    // display  the array (for Loop)
    System.out.println("Printing using for loop");
        for (int i = 0; i <= marks.length; i++) {
      System.out.println(marks[i]);
        }


    }
}
