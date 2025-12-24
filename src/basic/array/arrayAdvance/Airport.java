package basic.array.arrayAdvance;// Airport/ train/vegetable/ EyeHospital/GovermentExam


class Airport{

private String name;
private long id;
private  String city;
private  int numberOfPilot;
private boolean flightDelayed;

public Airport(){
}

public Airport(String name, long id){
	System.out.println("Initialize name, id");
	this.name=name;
	this.id=id;
}

public  Airport(String name, long id, String city){
	this(name,id);
	System.out.println("Initialize city");
	this.city=city;
}

public Airport(String name, long id , String city, int numberOfPilot){
	this(name,id,city);
	System.out.println("Initialize numberOfPilot");
	this.numberOfPilot= numberOfPilot;
}

public Airport(String name, long id, String city, int numberOfPilot, boolean flightDelayed){
	this(name,id,city,numberOfPilot);
	System.out.println("Initialize flightDelayed");
    this.flightDelayed=flightDelayed;
}

public String getName(){
	return name;
}
public long getId(){
	return id;
}
public String city(){
	return city;
}
public int getNumberOfPilot(){
	return numberOfPilot;
}
public  boolean getFlightDelayed(){
	return flightDelayed;
}
}

	
	