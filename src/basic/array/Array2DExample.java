package basic.array;


/* Multidimensional array  are array of array Each element of a M-D array itself marks in the previous example was a 1-D array.

 */
/* A 2-D array can be created as follow :
int [] [] flats = new int [2] [3]-->
 */
public class Array2DExample {
    public static void main(String[] args){
        int [] marks; // A 1-D Array
        int [] [] flats;  // A 2-D Array
        flats = new int [2][3];


        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        // Displaying the 2-D Array(for loop)
    System.out.println("Printing for 2-D Array using for loop");
    for(int i=0;i<flats.length;i++){
        for(int j=0;j<flats[i].length;j++){
        System.out.print(flats[i][j]);
        System.out.print(" ");
}
        System.out.println("");
      }
    }

    }

