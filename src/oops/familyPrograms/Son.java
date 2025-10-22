package Family;

public class Son  extends Father {
	
	
	private String name;
	private int salary;
	private int noOfXFriends;
	
	public Son() {
	}
	
	public Son(String name, int salary, int noOfXFriends) {
		this.name = name;
		this.salary = salary;
		this.noOfXFriends = noOfXFriends;
	}
	
	public void getSonDetails() {
		System.out.println("Son details - Name: " + this.name +
		                   ", Salary: " + this.salary +
		                   ", No. of Ex-Friends: " + this.noOfXFriends);
	}
}

