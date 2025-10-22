package oops.methodDetails.overloading;

class TicketType{
	public static void main(String[] args) {
		String TicketType="reg";

		switch(TicketType){
		case"regular" :System.out.println("Ticket price is 100");
			break;

	    case "gold" : System.out.println("Ticket price is 200");
	    	break;
	    default: System.out.println("Invalid ticket type");
	    	break;
		}
	}
}