package oops.arrayAdvance;

class EyeHospital {

    private String name;
    private long id;
    private String city;
    private int numberOfOphthalmologists;
    private boolean hasEmergencyServices;

    public EyeHospital() {
    }

    public EyeHospital(String name, long id) {
        System.out.println("Initialize name, id");
        this.name = name;
        this.id = id;
    }

    public EyeHospital(String name, long id, String city) {
        this(name, id);
        System.out.println("Initialize city");
        this.city = city;
    }

    public EyeHospital(String name, long id, String city, int numberOfOphthalmologists) {
        this(name, id, city);
        System.out.println("Initialize numberOfOphthalmologists");
        this.numberOfOphthalmologists = numberOfOphthalmologists;
    }

    public EyeHospital(String name, long id, String city, int numberOfOphthalmologists, boolean hasEmergencyServicesmergencyServices) {
        this(name, id, city, numberOfOphthalmologists);
        System.out.println("Initialize hasEmergencyServices");
        this.hasEmergencyServices= hasEmergencyServices;
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

    public int getNumberOfOphthalmologists() {
        return numberOfOphthalmologists;
    }

    public boolean getHasEmergencyServices() {
        return  hasEmergencyServices;
    }
}
