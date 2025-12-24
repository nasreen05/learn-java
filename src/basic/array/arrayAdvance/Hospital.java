package basic.array.arrayAdvance;

class Hospital{
	private String name;
	private int hospitalNumber;
	private String address;

	int[] numberofPatientWards={10,20,30,40,50};
	int[] numberofBedCounts={2,5,6,7};
	static String[] doctorName={"arif", "reshma", "rafia"," neha"};

	public static String[] getDoctorNames(){
		return doctorName;
	}

	 public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHospitalNumber() {
        return this.hospitalNumber;
    }

    public void setHospitalNumber(int hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
/*public void setName(string name){
	this.name =name;
}
public void setAddress(String address){
	this.address=address;
}

public String getAddress{
	return address;
}*/


}
/*public void setAddress(String address) {
	this.address=address;
	
}*/
		

