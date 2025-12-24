package basic.array.arrayAdvance;

class Array{
public static void main(String[]args){
int[] employeeIds=new int[5];
System.out.println(employeeIds);
for(int i=0; i<employeeIds.length;i++){
System.out.println(employeeIds[i]);
}
employeeIds[0]=1;
System.out.println(employeeIds[0]);
System.out.println(employeeIds[1]);
for(int i=0;i<employeeIds.length;i++){
employeeIds[i]=i+10;
}
for(int i=0;i<employeeIds.length;i++){
System.out.println(employeeIds[i]);
}
}
}
