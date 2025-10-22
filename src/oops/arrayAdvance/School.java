package oops.arrayAdvance;

class School {
	private String name;
	private int schoolNumber;
	private String schoolAddress;

	int[]  numberofClassroom={101,102,103,104,105,};
	int[] numberofClass={9,10,11,12};
	static String[] teacherName={"Neha", "Reshma","Sneha","Seuly"};

	public static String[] getTeacherNames(){
		return teacherName;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name= name;
	}
	public int getSchoolNumber(){
		return this.schoolNumber;
	}
	public void setSchoolNumber(int schoolName){
		this.schoolNumber =schoolNumber;
	}
	public String getSchoolAddress(){
		return this.schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress){
    this.schoolAddress = schoolAddress;
	}
	}
	