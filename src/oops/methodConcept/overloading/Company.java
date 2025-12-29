package oops.methodConcept.overloading;

class Company{
private String name;
private long id;
private String city;
private int numberOfEmployee;
// private String ceoname;
//private String ceocity;
//private float ceosalary;


private CeoRunner.Ceo ceo;


public Company(){

}
//construtor overloading -- multiple constructor with same name differ in length of parameter , or datatype


//Constructor Chaining- one constructor calling another constructor using this() statement

public Company(String name, long id){
System.out.println("Initialize name , id");
this.name=name;
this.id=id;
}
public Company(String name, long id , String city){
	this(name, id);
	System.out.println("Initialize city");
	this.city=city;
}
public Company(String name, long id, String city, int numberOfEmployee){
	this(name,id,city);
	System.out.println("Initialize employees");
	this.numberOfEmployee = numberOfEmployee;
}
public  void setceo(CeoRunner.Ceo ceo){
	this.ceo=ceo;
}
public CeoRunner.Ceo getCeo(){
	return ceo;
}

public String getName(){
	return  name;
}
public String getCity(){
	return city;
}
public long  getId(){
	return id;
}

public int getNumberOfEmployee(){
	return numberOfEmployee;
}



}

