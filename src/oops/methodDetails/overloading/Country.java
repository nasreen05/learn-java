package oops.methodDetails.overloading;

class Country{

    private String name;
    private int numberOfStates;
    private State[] states;
    private String primeMinister;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setNumberofStates(int numberOfStates){
        this.numberOfStates=numberOfStates;
    }

    public int getNumberOfStates(){
        return numberOfStates;
    
    }

    public void setStates(State[] states){
        this.states = states;
    }

    public State[] getStates(){
        return states;
    }

    public void setPrimeMinister(String name){
         primeMinister = name;
    }

    public String getPrimeMinister(){
        return primeMinister;
    }
   
}