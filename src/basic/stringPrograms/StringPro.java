package basic.stringPrograms;

import java.util.Scanner;

public class StringPro {
    public  static void main(String[]args){
    System.out.println("Enter the Website :");
    Scanner sc = new Scanner(System.in);
    String website =sc.nextLine();
    if(website.endsWith(".org")){
      System.out.println(" Organization  Website");
    }
    else if(website.endsWith(".com")){
      System.out.println("Commercial Website");
    }
    else if(website.endsWith(".in")){
      System.out.println("Indian Website");

    }
    sc.close();

    }
}

