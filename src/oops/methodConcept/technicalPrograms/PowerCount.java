package oops.methodConcept.technicalPrograms;

import java.util.Scanner;

public class PowerCount {
    public static int count(int n){
     int count=0;
     for(; n!=0;n/=10)
         count++;
     return count;
    }

    public static void main(String[] args) {
        Scanner  sc
    }
