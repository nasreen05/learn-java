package ClassTypeCasting;

class  Movie{

}
class ITmovie extends Movie{

}
class BlackBerry extends Movie{

}
public class MovieRunner {
    public static void main(String[] args){
        Movie movie= new BlackBerry(); //reference type is Movie.

        // On the right side (new BlackBerry()) → actual object created is of type BlackBerry.

// This is called upcasting (child object referred by parent type).

        System.out.println(movie instanceof BlackBerry);//true-->Because the actual object is new BlackBerry().
        System.out.println(movie instanceof  ITmovie);//false------>Because the object is not an ITmovie.

        BlackBerry blackBerry=(BlackBerry) movie;
        ITmovie iTmovie=(ITmovie) movie;


        /*Upcasting → Movie movie = new BlackBerry(); (safe).

        instanceof checks the real type of object at runtime.

        Downcasting → Works only if the object is really of that type.

         Wrong downcasting → runtime error. */
    }
}
