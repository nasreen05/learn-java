package oops.inheritanceConcept;

class Elephant extends Animal{
    private String name;
    private String sound;
    private int noOfLegs;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}
