class NeonNum{
public static void main(String[] args) {
		int num=9;
		int sqr=num*num;  // 8 1
         int out=0;

while(sqr>0){
int rem=sqr%10;     // 81%10
         out=out+rem;       //0+1=1
          sqr=sqr/10;       //81/10=8.1=8
}


	/*	int rem=sqr%10;     // 81%10
         out=out+rem;       //0+1=1
          sqr=sqr/10;       //81/10=8.1=8

          rem=sqr%10;       //8%10 =8
          out=out+rem ;      //1+8=9
          sqr=sqr/10;        //8/10=0.8=0 */
          
          if(out==num){
          	System.out.println(out+"is a NeonNum");
          }else{
          	System.out.println(out+"is not a NeonNum");
          }
          }

 }

