package oops.arrayAdvance;

class Studio {
    private String studioName;
    private int studioNumber;
    private String city;

    int[] setNumbers = {1, 2, 3, 4};
    int[] crewCount = {10, 12, 15};
    static String[] directors = {"Ravi", "Shweta", "Manoj"};

    public static String[] getDirectors() {
        return directors;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String name) {
        this.studioName = name;
    }

    public int getStudioNumber() {
        return studioNumber;
    }

    public void setStudioNumber(int num) {
        this.studioNumber = num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String c) {
        this.city = c;
    }
}
