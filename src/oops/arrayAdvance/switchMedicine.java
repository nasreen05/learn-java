package oops.arrayAdvance;

class SwitchMedicine {
	public static void main(String[] args) {

		
		String medicine = "Paracetamol";

		if (medicine.equals("Paracetamol")) {
			System.out.println("Price: Rs. 10.00");
		} else if (medicine.equals("Aspirin")) {
			System.out.println("Price: Rs. 15.00");
		} else if (medicine.equals("Cetirizine")) {
			System.out.println("Price: Rs. 12.00");
		} else if (medicine.equals("Amoxicillin")) {
			System.out.println("Price: Rs. 25.00");
		} else if (medicine.equals("Ibuprofen")) {
			System.out.println("Price: Rs. 18.00");
		} else {
			System.out.println("Medicine not found");
		}

		
		String med = "Amoxicillin";
		switch (med) {
			case "Paracetamol":
				System.out.println("Price: Rs. 10.00");
				break;
			case "Aspirin":
				System.out.println("Price: Rs. 15.00");
				break;
			case "Cetirizine":
				System.out.println("Price: Rs. 12.00");
				break;
			case "Amoxicillin":
				System.out.println("Price: Rs. 25.00");
				break;
			case "Ibuprofen":
				System.out.println("Price: Rs. 18.00");
				break;
			default:
				System.out.println("Medicine not available");
		}
	}
}
