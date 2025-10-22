package oops.arrayAdvance;

class Library {
private String libraryName;
	private int libraryId;
	private String location;

	int[] bookNum={201,202,203,204};
	static String[] bookNames={"java","python","c++","HTML"};

	public static String[] getBookNames(){
		return bookNames;
	}
	 public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}	