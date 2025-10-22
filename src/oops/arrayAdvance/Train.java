package oops.arrayAdvance;

class Train {
    private String name;
    private long id;
    private String city;
    private int numberOfEngineers;
    private boolean isDelayed;

    public Train() {
    }

    public Train(String name, long id) {
        System.out.println("Initialize name, id");
        this.name = name;
        this.id = id;
    }

    public Train(String name, long id, String city) {
        this(name, id);
        System.out.println("Initialize city");
        this.city = city;
    }

    public Train(String name, long id, String city, int numberOfEngineers) {
        this(name, id, city);
        System.out.println("Initialize numberOfEngineers");
        this.numberOfEngineers = numberOfEngineers;
    }

    public Train(String name, long id, String city, int numberOfEngineers, boolean isDelayed) {
        this(name, id, city, numberOfEngineers);
        System.out.println("Initialize isDelayed");
        this.isDelayed = isDelayed;
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

    public int getNumberOfEngineers() {
        return numberOfEngineers;
    }

    public boolean getIsDelayed() {
        return isDelayed;
    }
}
