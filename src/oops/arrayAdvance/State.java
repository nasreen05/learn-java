package oops.arrayAdvance;

class State{

 

    private String name;
    private int noOfDistrics;
    private int noOfMLAS;
    private String chiefMinister;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setNoOfDistrics(int num){

    noOfDistrics = num;
}

public int getNoOfDistrics(){
    return noOfDistrics;
}

public void setNoOfMLAS(int mlas){
    noOfMLAS = mlas;
}

public int getNoOfMLAS(){
    return noOfMLAS;

}

public void setChiefMinister(String name){
    chiefMinister = name;

}

public String getChiefMinister(){
    return chiefMinister;
}

}