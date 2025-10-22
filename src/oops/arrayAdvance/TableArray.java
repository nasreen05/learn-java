package oops.arrayAdvance;// store table in array

class TableArray{
//algorithm
//0=3; 

 public static  void main(String[] args){
 
 int [] threeTable =new int[10];
 //i=0;
 //3*1=3
 for(int i=0;i<threeTable.length;i++){
 threeTable[i]=3*(i+1);
 }
 for(int i=1;i<threeTable.length;i++){
threeTable[i-1]=3*i;
}
System.out.println("3's Multiplication table");
for(int i=0;i<threeTable.length;i++){

System.out.println(threeTable[i]);
}
 }
}
 