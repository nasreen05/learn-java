package oops.methodDetails.overloading;

class Armstrong{
	public static void main(String[] args) {
		int num=153;
		int num1=num;
		int out=0;

        while(num>0){
        	int rem=num%10;
        	out=out+rem*rem*rem;
        	num=num/10;

        }

		if(out==num1){
			System.out.println(num1+"Armstrong is a number");
		}else{
			System.out.println(num1+"Armstrong is not a number");
		}
    }

		}