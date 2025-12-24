package basic.array.arrayAdvance;

class LibraryArrayRunner{
    public static void main(String[] args) {
        Library[] librarys = new Library[5];

        Library library = new Library();
        library.setLibraryName("The Book Nook");
        library.setLocation("Delhi");
        librarys[0] = library;

        Library library1 = new Library();
        library1.setLibraryName("Imagine Library");
        library1.setLocation("Kolkata");
        librarys[1] = library1; 

        Library library2 = new Library();
        library2.setLibraryName("Knowledge Tree");
        library2.setLocation("Mumbai");
        librarys[2] = library2;  

        Library library3 = new Library();
        library3.setLibraryName("Books Reading ");
        library3.setLocation("Siliguri");
        librarys[3] = library3; 
		
		Library library4 = new Library();
        library4.setLibraryName("Social Library");
        library4.setLocation("Chennai");
        librarys[4] = library4; 


        for (int i = 0; i < librarys.length; i++) {
            System.out.println("Library " + (i + 1) + ":");
            Library localLibrary = librarys[i];
            System.out.println("Name: " + localLibrary.getLibraryName());
            System.out.println("Location: " + localLibrary.getLocation());
            System.out.println();
        }
    }
}
