package Area;

import java.util.Scanner;

public class RectangleRunner {

    public static void main(String[] args){
    //args[0]
        //args[1]
        //scanner
        //reading inputs dynamically with the help of scanner class

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value");

        //next
        String readDate = sc.nextLine();
        System.out.println(readDate);

        //sc.nextInt();
        //sc.nextfloat();

        //text
        //text, image , audio
        //message (string text)
        //message(String text, String img)
        //message (String text, String img, String value)
        //method overloading - same method name differ in length of parameter or datatype


      //  sc.nextInd();
       //  sc.nextFloat();


        Rectangle rectangle= new Rectangle(10 , 20);
        rectangle.findArea();
        System.out.println(rectangle.toString());

        //default inheritance -object class - to String ()



    }
}
