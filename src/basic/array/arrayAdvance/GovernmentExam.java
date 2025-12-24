package basic.array.arrayAdvance;

class GovernmentExam {
    private String name;
    private long id;
    private String city;
    private int numberOfCenters;
    private boolean resultsDelayed;

    public GovernmentExam() {}

    public GovernmentExam(String name, long id) {
        System.out.println("Initialize name, id");
        this.name = name;
        this.id = id;
    }

    public GovernmentExam(String name, long id, String city) {
        this(name, id);
        System.out.println("Initialize city");
        this.city = city;
    }

    public GovernmentExam(String name, long id, String city, int numberOfCenters) {
        this(name, id, city);
        System.out.println("Initialize numberOfCenters");
        this.numberOfCenters = numberOfCenters;
    }

    public GovernmentExam(String name, long id, String city, int numberOfCenters, boolean resultsDelayed) {
        this(name, id, city, numberOfCenters);
        System.out.println("Initialize resultsDelayed");
        this.resultsDelayed = resultsDelayed;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String city() {
        return city;
    }

    public int getNumberOfCenters() {
        return numberOfCenters;
    }

    public boolean getResultsDelayed() {
        return resultsDelayed;
    }
}
