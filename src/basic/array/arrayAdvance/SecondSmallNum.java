package basic.array.arrayAdvance;

class SecondSmallNum{
	public static void main(String[] args) {
		 int [] num={6,8,4,3,9};
		 int smallest=num[0];
		 int second=0;

		 for(int i=1;i< num.length;i++){
		 	if(num[i]<smallest){
		 		second=smallest;
		 		smallest= num[i];
		 	}else if(num[i]<second && num[i]!= smallest){
		 		second=num[i];

		 	
		 	}
		 }


		 System.out.println("second smallest no.is "+second);
	}
}