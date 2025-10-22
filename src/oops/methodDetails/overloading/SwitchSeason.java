package oops.methodDetails.overloading;

class SwitchSeason {
	
	public static void main(String[] args) {

		// 1 = Winter, 2 = Spring, 3 = Summer, 4 = Monsoon, 5 = Autumn
		int season = 3;

		// if-else version
		if (season == 1) {
			System.out.println("Winter");
		} else if (season == 2) {
			System.out.println("Spring");
		} else if (season == 3) {
			System.out.println("Summer");
		} else if (season == 4) {
			System.out.println("Monsoon");
		} else if (season == 5) {
			System.out.println("Autumn");
		} else {
			System.out.println("Invalid season");
		}

		String seasonName = "";

		switch (season) {
			case 1:
				System.out.println("Winter");
				seasonName = "Winter";
				break;
			case 2:
				System.out.println("Spring");
				seasonName = "Spring";
				break;
			case 3:
				System.out.println("Summer");
				seasonName = "Summer";
				break;
			case 4:
				System.out.println("Monsoon");
				seasonName = "Monsoon";
				break;
			case 5:
				System.out.println("Autumn");
				seasonName = "Autumn";
				break;
			default:
				System.out.println("Invalid season");
		}
	}
}
