package basic.array.arrayAdvance;

class CinemaArrayRunner{
	
    public static void main(String[] args) {
        Cinema[] cinemas = new Cinema[5];

        Cinema cinema = new Cinema();
        cinema.setManager("Neha");
        cinema.setCity("Kolkata");
        cinemas[0] = cinema;

        Cinema cinema1 = new Cinema();
        cinema1.setManager("Reshma");
        cinema1.setCity("Siliguri");
        cinemas[1] = cinema1;  

        Cinema cinema2 = new Cinema();
        cinema2.setManager("Rafia");
        cinema2.setCity("Darjeeling");
        cinemas[2] = cinema2;  

        Cinema cinema3 = new Cinema();
        cinema3.setManager("Nasreen");
        cinema3.setCity("New Town");
        cinemas[3] = cinema3; 

        Cinema cinema4 = new Cinema();
        cinema4.setManager("Arif");
        cinema4.setCity("Park Circus");
        cinemas[4] = cinema4;  

        
        for (int i = 0; i < cinemas.length; i++) {
            System.out.println("Cinema " + (i + 1));
            Cinema localCinema = cinemas[i];
            System.out.println("Manager: " + localCinema.getManager());
            System.out.println("City: " + localCinema.getCity());
            System.out.println();
        }
    }
}


