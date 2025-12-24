package basic.array.arrayAdvance;

class Factory {
    private String factoryName;
    private int factoryId;
    private String location;

    int[] machineIds = {201, 202, 203, 204};
    int[] workersPerShift = {12, 14, 10};
    static String[] supervisors = {"Amit", "Rahul", "Nina"};

    public static String[] getSupervisors() {
        return supervisors;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String name) {
        this.factoryName = name;
    }

    public int getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(int id) {
        this.factoryId = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String loc) {
        this.location = loc;
    }
}
