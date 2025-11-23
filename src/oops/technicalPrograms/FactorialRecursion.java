package oops.technicalPrograms;

import javax.imageio.stream.ImageInputStream;

class FactorialRecursion {
static int recursion(int n){
int r=0;
if(n==1 || n==0){
return n;
}
if(n>1){
    r=n*recursion(n-1);
}
return r;
}
public static void main(String[] args){

    System.out.println((recursion(5)));
}
}