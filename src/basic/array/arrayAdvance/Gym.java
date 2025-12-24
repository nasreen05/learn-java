package basic.array.arrayAdvance;

class Gym {
    private String trainerName;
    private int gymId;
    private String area;

    float[] memberWeights = {60.5f, 70.2f, 80.0f, 55.8f};
    static char[] gymSections = {'A', 'B', 'C', 'D'};

    public static char[] getGymSections() {
        return gymSections;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
