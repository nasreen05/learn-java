package oops.arrayAdvance;

class Laboratory {
    private String labName;
    private int labId;
    private String field;

    int[] testIds = {111, 112, 113};
    int[] testCounts = {5, 7, 9};
    static String[] technicians = {"Ajay", "Sneha", "Komal"};

    public static String[] getTechnicians() {
        return technicians;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String name) {
        this.labName = name;
    }

    public int getLabId() {
        return labId;
    }

    public void setLabId(int id) {
        this.labId = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String f) {
        this.field = f;
    }
}
