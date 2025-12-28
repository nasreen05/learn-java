package basic.controlStatement.jumpingConcept;

class SwitchExam{
	//if else , for, while ,do while
	//switch
	public static void main(String[] args) {


		//sunday=1
		//monday=2
		//datatype
	

		int day=6;
		if(day==2){
			System.out.println("Monday");
	}else if(day==1){
		System.out.println("Sunday");
	}else if(day==3){
		System.out.println("Tuesday");
		} else if(day==4){
		System.out.println("Wednessday");
		} else if(day==5){
		System.out.println("Thuesday");
		} else if(day==6){
		System.out.println("Friday");
		} else if(day==7){
		System.out.println("Saturday");
	}else{
		System.out.println("Invalid day");
	}
  //primitive datatype , String in switch expression 
		String dayOfWeek=" ";
		switch(day){
		case 1: System.out.println("sunday");
			dayOfWeek="Sunday";
			break;

			case 2: System.out.println("monday");			
			break;

			case 3: System.out.println("tuesday");
			break;

			case 4: System.out.println("wednessday");
			break;

			case 5: System.out.println("thusday");
			break;

			case 6: System.out.println("friday");
			break;
		default:System.out.println("Invalid day");

		}
	}
}