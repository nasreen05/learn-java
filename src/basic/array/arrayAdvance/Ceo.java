package basic.array.arrayAdvance;

class Ceo {

    private String name;
    private int ceoId;
    private String city;
    private double salary; // Added for getSalary()

    public Ceo(String name, int ceoId, String city) {
        this.name = name;
        this.ceoId = ceoId;
        this.city = city;
        this.salary = 100000.00; // Default salary value (you can change it)
    }

    public String getName() {
        return name;
    }

    public int getCeoId() {
        return ceoId;
    }

    public String getCity() {
        return city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
