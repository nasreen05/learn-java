package oops.arrayAdvance;


class Company {

    private String name;
    private int companyNum;
    private String companyAddress;
    private Ceo ceo;

    int[] employeeId = {101, 102, 103, 104, 105};
    static String[] employeeName = {"neha", "reshma", "sneha", "seuly"};

    public Company(String name, float weight, float displaySize) {
        this.name = name;
    }

    public Company() {
    }

    // ✅ Added 3-parameter constructor for CompanyRunner
    public Company(String name, int companyNum, String companyAddress) {
        this.name = name;
        this.companyNum = companyNum;
        this.companyAddress = companyAddress;
    }

    public Company(String name, int companyNum, String companyAddress, int dummy) {
        this.name = name;
        this.companyNum = companyNum;
        this.companyAddress = companyAddress;
    }

    public static String[] getEmployeeNames() {
        return employeeName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompanyNum() {
        return this.companyNum;
    }

    public void setCompanyNum(int companyNum) {
        this.companyNum = companyNum;
    }

    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public void setCeo(Ceo ceo) {
        this.ceo = ceo;
    }

    public Ceo getCeo() {
        return this.ceo;
    }

    public String getCity() {
        return this.companyAddress;
    }

    public String getCompanyName() {
        return this.name;
    }

    // ✅ For CompanyRunner compatibility
    public int getId() {
        return this.companyNum;
    }

    public int getNumberOfEmployee() {
        return employeeId.length;
    }
}
