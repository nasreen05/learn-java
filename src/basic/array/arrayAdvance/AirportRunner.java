package basic.array.arrayAdvance;

class AirportRunner{
	

    public static void main(String[] args) {
        Airport airport1 = new Airport("Air India", 1231, "Kolkata", 4, true);

        System.out.println(airport1.getName());
        System.out.println(airport1.getId());
        System.out.println(airport1.city());           
        System.out.println(airport1.getNumberOfPilot());
        System.out.println(airport1.getFlightDelayed());
		
		
		System.out.println();

        Airport airport2 = new Airport("Akasa", 1341, "Delhi", 5, false);

        System.out.println(airport2.getName());
        System.out.println(airport2.getId());
        System.out.println(airport2.city());           
        System.out.println(airport2.getNumberOfPilot());
        System.out.println(airport2.getFlightDelayed());
		
		
		System.out.println();

        Airport airport3 = new Airport("SpiceJet", 1351, "Delhi", 6, false);

        System.out.println(airport3.getName());
        System.out.println(airport3.getId());
        System.out.println(airport3.city());           
        System.out.println(airport3.getNumberOfPilot());
        System.out.println(airport3.getFlightDelayed());
		
		
		System.out.println();

        Airport airport4 = new Airport("Indigo", 3441, "Mumbai", 7, true);

        System.out.println(airport4.getName());
        System.out.println(airport4.getId());
        System.out.println(airport4.city());           
        System.out.println(airport4.getNumberOfPilot());
        System.out.println(airport4.getFlightDelayed());
		
		
		System.out.println();

        Airport airport5 = new Airport("Vistara", 9234, "Bagdogra", 9, false);

        System.out.println(airport5.getName());
        System.out.println(airport5.getId());
        System.out.println(airport5.city());           
        System.out.println(airport5.getNumberOfPilot());
        System.out.println(airport5.getFlightDelayed());
    }
}
