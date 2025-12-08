package basic.array.basic;


public class Array2DProgram {
    public static void main(String[] args){
         int [] marks;
         int [] [] flats;
         flats = new int[3][3];


        flats[0][0]=101;
        flats[0][1]=101;
        flats[0][2]=101;
        flats[1][0]=201;
        flats[1][1]=201;
        flats[1][2]=201;
        flats[2][0]=301;
        flats[2][1]=301;
        flats[2][2]=301;

        for( int i=0;i<flats.length;i++){
            for( int j=0;j<flats[i].length;j++){
        System.out.print(flats[i][j]);
        System.out.print(" ");
            }
      System.out.println("");
        }
        }


       /*  Similarly a 3-D array can be created as follows :
       String[] [] arr= new String[2][3][4]
        */


    }
