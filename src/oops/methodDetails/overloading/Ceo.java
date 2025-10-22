package oops.methodDetails.overloading;

class Ceo{
	private String name;
	private float salary;
	private String city;

	public Ceo(String name, float salary, String city){
		this.name=name;
        this.salary=salary;;
        this.city=city;

}
    public String getName(){
    return name;
}
    public float getSalary(){
    return salary;
  }
  public String getcity(){
  	return city;
  }
}